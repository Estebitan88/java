package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2= new Rectangulo();
		Rectangulo r3= new Rectangulo();
		
		int areaR1;
		int areaR2;
		double perimetro;
		
		r1.base=10;
		r1.altura=5;
		
		r2.base=8;
		r2.altura=5;
		
		r3.base=4;
		r3.altura=2;
		
		areaR1=r1.CalcularArea();
		areaR2=r2.CalcularArea();
		perimetro=r3.ClacularPerimetro();
		
	System.out.println("Area de r1: "+areaR1);
	System.out.println("Area de r2: "+areaR2);
	System.out.println("Perimetro: "+ perimetro);
	}
	

}
