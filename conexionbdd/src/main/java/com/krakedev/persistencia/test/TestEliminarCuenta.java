package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminCuenta;

public class TestEliminarCuenta {

	public static void main(String[] args) {
		try {
			String cedulaAEliminar = "0201813573";

			AdminCuenta.eliminar(cedulaAEliminar);
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}
	}

}
