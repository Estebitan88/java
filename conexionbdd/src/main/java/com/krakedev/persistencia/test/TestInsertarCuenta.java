package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Cuenta;
import com.krakedev.persistencia.servicios.AdminCuenta;
import com.krakedev.persistencia.utils.Convertidor;

public class TestInsertarCuenta {

	public static void main(String[] args) {
		Cuenta c = new Cuenta("4444", "0201813573");
		try {

			Date fechaCrea = Convertidor.convertirFecha("2020/12/23");
			

			c.setFechaCreacion(fechaCrea);
			c.setSaldo(new BigDecimal(1230.45));

			AdminCuenta.insertar(c);
		} catch (Exception e) {

			System.out.println("error en el sistema: " + e.getMessage());
		}

	}

}
