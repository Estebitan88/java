package com.cmc.evaluacion;

import com.cmc.entidades.Cliente;
import com.cmc.entidades.Cuota;

public class Prestamo {

	private double monto;
	private double interes;
	private int plazo;
	private Cuota[] cuotas;
	private Cliente cliente;

	public Prestamo(double monto, double interes, int plazo) {
		this.monto = monto;
		this.interes = interes;
		this.plazo = plazo;

		this.cuotas = new Cuota[plazo];
	}

	public void mostarPrestamo() {
		System.out.println("monto" + getMonto() + "interes=" + getInteres() + "plazo" + getPlazo());
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public int getPlazo() {
		return plazo;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}

	public Cuota[] getCuotas() {
		return cuotas;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
