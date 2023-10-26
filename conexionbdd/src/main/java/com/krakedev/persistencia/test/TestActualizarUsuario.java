package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Usuario;
import com.krakedev.persistencia.servicios.AdminUsuario;

public class TestActualizarUsuario {

	public static void main(String[] args) {
		Usuario u = new Usuario("9999999991", "Lalo", "Landa", "corriente", 50);
		try {

			AdminUsuario.actualizar(u);
		} catch (Exception e) {

			System.out.println("error en el sistema: " + e.getMessage());
		}

	}

}
