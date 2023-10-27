package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultarPersonaApellido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ArrayList<Persona> personas = AdminPersonas.buscarPorApellido("G");
			System.out.println(personas);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
