package com.cmc.test;

import com.cmc.evaluacion.CalculadoraAmortizacion;
import com.cmc.evaluacion.Prestamo;

public class TestCuota {
    public static void main(String[] args) {
        Prestamo prestamo = new Prestamo(5000, 12, 12);
        double cuota = CalculadoraAmortizacion.calcularCuota(prestamo);
        System.out.println("Cuota: " + cuota);
    }
}
