package com.krakedev;

public class Rectangulo {
	
	public int base;
	public int altura;
	
	public int CalcularArea() {
		int area=base*altura;
		return area;
	}
	
	public double ClacularPerimetro() {
		double perimetro=(base*2)+(altura*2);
		return perimetro;
	}

}
