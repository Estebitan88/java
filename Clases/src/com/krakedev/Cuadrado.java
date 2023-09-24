package com.krakedev;

public class Cuadrado {

	public int lado;

	public double CalcularArea() {
		double area = lado * lado;
		return area;
	}

	public double calcularPerimetro() {
		double perimetro = lado * 4;
		return perimetro;

	}

}
