package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminUsuario;

public class TestEliminarUsuario {

	public static void main(String[] args) {
		try {
			String cedulaAEliminar = "9999999999";

			AdminUsuario.eliminar(cedulaAEliminar);
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}
	}




	}


