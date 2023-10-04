package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdminPersonas admin = new AdminPersonas();

		admin.agregar(new Persona("Mario", "Benedeti", 50));
		admin.agregar(new Persona("Clark", "Kent", 20));
		admin.agregar(new Persona("Bruno", "Diaz", 30));

		admin.imprimir();

		Persona p1 = admin.buscarPorNombre("Bruno");
		if (p1 != null) {
			System.out.println("Encontrado: " + p1.getApellido() + " " + p1.getEdad());
		} else {
			System.out.println("No existe la persona con ese nombre");
		}
		ArrayList<Persona> personasMayores = admin.buscarMayores(40);
		System.out.println("Mayores: " + personasMayores.size());
	}

}
