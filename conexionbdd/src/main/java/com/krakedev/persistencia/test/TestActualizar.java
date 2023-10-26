package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("U", "Union Libre");
		Persona p = new Persona("0201813573", "Esteban", "SuperActualizado", ec);
		try {
			Date fechaNac = Convertidor.convertirFecha("2040/12/23");
			Date horaNac = Convertidor.convertirAHora("01:21");

			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setCantidadAhorrada(new BigDecimal(999.45));
			p.setNumeroHijos(100);

			AdminPersonas.actualizar(p);
		} catch (Exception e) {

			System.out.println("error en el sistema: " + e.getMessage());
		}

	}

}
