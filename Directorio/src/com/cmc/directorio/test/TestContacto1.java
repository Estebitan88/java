package com.cmc.directorio.test;

import com.cm.directorio.entidades.Contacto;
import com.cm.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefono telef = new Telefono("movi", "123456", 1);
		Contacto c = new Contacto("Esteban", "Guana", telef, 1.1);
		
		System.out.println(c.getNombre());
		System.out.println(c.getApellido());
		System.out.println(telef.getOperadora());
		System.out.println(telef.getNumero());
		

	}

}
