package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsulatrPersonaCedula {

	public static void main(String[] args) {
		try {
			Persona persona =new Persona();
			persona=AdminPersonas.buscarPorCedula("0201813573");
			System.out.println(persona);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
