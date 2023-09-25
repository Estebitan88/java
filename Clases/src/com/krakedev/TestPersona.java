package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p; // 1. declaro un variable llamada p de tipo persona
		Persona p2 = new Persona();
		Persona p3 = new Persona("Esteban");
		Persona p4 = new Persona("Esteban", 35, 1.70);

		System.out.println("Nombre:" + p3.getNombre());
		System.out.println("Edad:" + p3.getEdad());
		System.out.println("Estatura:" + p3.getEstatura());

		System.out.println("Nombre:" + p4.getNombre());
		System.out.println("Edad:" + p4.getEdad());
		System.out.println("Estatura:" + p4.getEstatura());

		p = new Persona(); // instanciar a un objeto persona, referenciarlo con p
		// 3. Accedo a los atributos
		System.out.println("Nombre:" + p.getNombre());
		System.out.println("Edad:" + p.getEdad());
		System.out.println("Estatura:" + p.getEstatura());

		// 4. modificar atributos
		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.23);

		System.out.println("-----------------------------------");
		// 5. accedo a los atributos

		System.out.println("Nombre:" + p.getNombre());
		System.out.println("Edad:" + p.getEdad());
		System.out.println("Estatura:" + p.getEstatura());

		System.out.println("-----------------------------------");

		p2.setNombre("Angelina");
		System.out.println("p.nombre: " + p.getNombre());
		System.out.println("p2.nombre: " + p2.getNombre());

	}

}
