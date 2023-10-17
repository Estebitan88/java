package com.cmc.evaluacion;

import java.util.ArrayList;

import com.cmc.entidades.Cuota;

public class CalculadoraAmortizacion {
	public static double calcularCuota(Prestamo prestamo) {
		double cuota;
		double interes = (prestamo.getInteres() / 100) / prestamo.getPlazo();
		cuota = (prestamo.getMonto() * interes) / (1 - (Math.pow(1 + interes, -prestamo.getPlazo())));
		return cuota;
	}

	public static void generarTabla(Prestamo prestamo) {
		double cuota = calcularCuota(prestamo);

		// Crear e inicializar las cuotas del préstamo
		Cuota[] cuotas = prestamo.getCuotas();
		for (int i = 0; i < cuotas.length; i++) {
			cuotas[i] = new Cuota(i + 1);
			cuotas[i].setCuota(cuota);

			if (i == 0) {
				// Para la primera cuota, el valor de inicio del período es igual al monto del
				// préstamo
				cuotas[i].setInicio(prestamo.getMonto());
			} else {
				// Para las cuotas posteriores, el valor de inicio del período es igual al saldo
				// de la cuota anterior
				cuotas[i].setInicio(cuotas[i - 1].getSaldo());
			}

			calcularValoresCuota(prestamo, cuotas[i]);
		}
	}

	public static void calcularValoresCuota(Prestamo prestamo, Cuota cuota) {
		// Calcular el valor del interes(capital de inico * 0.01)
		double interesMesesPlazo = (prestamo.getInteres() / 100) / prestamo.getPlazo();
		double valorInteres = cuota.getInicio() * interesMesesPlazo;
		double abonoCapital =  cuota.getCuota() - valorInteres;
		double saldo = cuota.getInicio() - abonoCapital;
		
		cuota.setInteres(valorInteres);
		cuota.setAbonoCapital(abonoCapital);
		cuota.setSaldo(saldo);
	}

	public static void mostrarTabla(Prestamo prestamo) {
		Cuota[] cuotas = prestamo.getCuotas();
		System.out.println("N°" + "|" + "Cuota" + "|" + "Capital al inicio del periodo" + "|" + "Interes" + "|"
				+ "Capital" + "|" + "Saldo al final del periodo");
		for (Cuota cuota : cuotas) {
			cuota.mostrarPrestamo();
		}
	}
}
