package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuadrado cuadrado1 = new Cuadrado(4);
		Cuadrado cuadrado2 = new Cuadrado(6);
		Cuadrado cuadrado3 = new Cuadrado(8);

		double areaCuadrado1;
		double areaCuadrado2;
		double areaCuadrado3;

		double perimetroCuadrado1;
		double perimetroCuadrado2;
		double perimetroCuadrado3;

//		cuadrado1.setLado(4);
//		cuadrado2.setLado(6);
//		cuadrado3.setLado(8);

		areaCuadrado1 = cuadrado1.CalcularArea();
		areaCuadrado2 = cuadrado2.CalcularArea();
		areaCuadrado3 = cuadrado3.CalcularArea();

		perimetroCuadrado1 = cuadrado1.calcularPerimetro();
		perimetroCuadrado2 = cuadrado2.calcularPerimetro();
		perimetroCuadrado3 = cuadrado3.calcularPerimetro();
		
		System.out.println("---AREA DEL CUADRADO----");

		System.out.println("Area del cuadrado 1 : " + areaCuadrado1);
		System.out.println("Area del cuadrado 2 : " + areaCuadrado2);
		System.out.println("Area del cuadrado 3 : " + areaCuadrado3);

		System.out.println("---PERIMETRO DEL CUADRADO----");

		System.out.println("Perimetro del cuadrado 1 : " + perimetroCuadrado1);
		System.out.println("Perimetro del cuadrado 2 : " + perimetroCuadrado2);
		System.out.println("Perimetro del cuadrado 3 : " + perimetroCuadrado3);

	}

}
