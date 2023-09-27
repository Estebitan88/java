package com.cmc.directorio.test;

import com.cm.directorio.entidades.AdminTelefono;
import com.cm.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Telefono telf =new Telefono("movi", "098234234", 20);
		
		AdminTelefono at=new AdminTelefono();
		
		at.activarMensajeria(telf);
		
		System.out.println (telf.getOperadora());
		System.out.println (telf.getNumero());
		System.out.println (telf.getCodigo());
		System.out.println (telf.isTieneWhatsapp());
		
		

		
		
		
		

	}

}
