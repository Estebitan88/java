package com.krakedev.excepciones;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inicio");
		String a = null;
		try {
			System.out.println("abre la conexion bdd");
			a.substring(3);
			System.out.println("fin");
			
		} catch (Exception ex) {
			System.out.println("entral al catch");
		} finally {
			System.out.println("ingresa al finally");
			
			System.out.println("cierra la conexion bdd");
		}
		System.out.println("fuera del cath");

	}

}
