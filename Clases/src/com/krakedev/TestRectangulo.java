package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 = new Rectangulo(10,5);
		Rectangulo r2= new Rectangulo(8,5);
		Rectangulo r3= new Rectangulo(4,2);
		
		int areaR1;
		int areaR2;
		double perimetro;

//		sin constructor 
		
//		r1.setBase(10);
//		r1.setAltura(5);
//		
//		r2.setBase(8);
//		r2.setAltura(5);
//		
//		r3.setBase(4);
//		r3.setAltura(2);
		
		areaR1=r1.CalcularArea();
		areaR2=r2.CalcularArea();
		perimetro=r3.ClacularPerimetro();
		
	System.out.println("Area de r1: "+areaR1);
	System.out.println("Area de r2: "+areaR2);
	System.out.println("Perimetro: "+ perimetro);
	}
	

}
