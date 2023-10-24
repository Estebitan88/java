package com.krakedev.estaticos;

public class TestEstaticos {

	public static void main(String[] args) {
		// para invocar un metodo estatico, se lo hace directamente de la clase
//		NO hace falta instaciar un objeto

		double numero = Math.random();

		System.out.println(numero);

		int radio = 10;
		double area = Math.PI * radio;

	}

}
