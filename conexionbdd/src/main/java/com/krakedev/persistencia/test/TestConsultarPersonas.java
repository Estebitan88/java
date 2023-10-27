package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultarPersonas {

	public static void main(String[] args) {

		try {
			ArrayList<Persona> personas = AdminPersonas.buscarPorNombre("estebitan");
			System.out.println(personas);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
