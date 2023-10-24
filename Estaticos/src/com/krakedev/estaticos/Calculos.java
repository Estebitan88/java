package com.krakedev.estaticos;

public class Calculos {
//	final hace que el valor no puede cambiar, y hace convertirse en una constante
	private final double IVA = 12;
	
	
	public double calcularIva(double monto) {

		return monto*IVA/100;
	}
}
