package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Cuenta;
import com.krakedev.persistencia.servicios.AdminCuenta;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizarCuenta {

	public static void main(String[] args) {

		Cuenta c = new Cuenta("4444", "0201813573");
		try {
			Date fechaCrea = Convertidor.convertirFecha("2040/12/23");

			c.setFechaCreacion(fechaCrea);
			c.setSaldo(new BigDecimal(1));

			AdminCuenta.actualizar(c);
		} catch (Exception e) {

			System.out.println("error en el sistema: " + e.getMessage());
		}

	}

}
