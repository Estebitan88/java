package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p; // 1. declaro un variable llamada p de tipo persona
		Persona p2 = new Persona();

		p = new Persona(); // instanciar a un objeto persona, referenciarlo con p
		// 3. Accedo a los atributos
		System.out.println("Nombre:" + p.nombre);
		System.out.println("Edad:" + p.edad);
		System.out.println("Estatura:" + p.estatura);

		// 4. modificar atributos
		p.nombre = "Mario";
		p.edad = 45;
		p.estatura = 1.23;

		System.out.println("-----------------------------------");
		//5. accedo a los atributos
		
		System.out.println("Nombre:" + p.nombre);
		System.out.println("Edad:" + p.edad);
		System.out.println("Estatura:" + p.estatura);
		
		System.out.println("-----------------------------------");	
		
		p2.nombre = "Angelina";
		System.out.println("p.nombre: " + p.nombre);
		System.out.println("p2.nombre: " + p2.nombre);

	}

}
