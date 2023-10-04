package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cadenas;
		String valorRecueperado;
		
		cadenas=new ArrayList<String>();
		
		System.out.println(cadenas.size());
		
		cadenas.add("uno");//0
		cadenas.add("dos");//1
		
		System.out.println(cadenas.size());
		
		valorRecueperado=cadenas.get(1);
		System.out.println(valorRecueperado);
		
		String cadena;
		for(int i=0;i<cadenas.size();i++) {
			cadena=cadenas.get(i);
			System.out.println("cadena: "+cadena);
		}
		
	}

}
