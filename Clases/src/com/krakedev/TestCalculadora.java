package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora calculadora =new Calculadora();
		int resultadoSuma;
		int resultadoResta;
		double resultadomultiplicacion;
		double resultadoDivision;
		double resultadoPromedio;
		
		resultadoSuma=calculadora.sumar(5, 3);
		resultadoResta=calculadora.restar(10, 3);
		resultadomultiplicacion=calculadora.multiplicar(2, 3);
		resultadoDivision=calculadora.dividir(5, 10);
		resultadoPromedio=calculadora.promediar(10, 8, 9);
		
		System.out.println("Resultado: "+ resultadoSuma);
		System.out.println("Resultado: "+ resultadoResta);
		System.out.println("Resultado: "+ resultadomultiplicacion);
		System.out.println("Resultado: "+ resultadoDivision);
		System.out.println("Resultado: "+ resultadoPromedio);

		calculadora.mostrarRresultado();

	}

}
