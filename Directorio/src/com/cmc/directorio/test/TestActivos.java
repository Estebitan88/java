package com.cmc.directorio.test;

import com.cm.directorio.entidades.AdminContactos;
import com.cm.directorio.entidades.Contacto;
import com.cm.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Telefono telef = new Telefono("movi", "0923456", 1,true);
		Telefono telef1 = new Telefono("movi", "0923456", 1);
	
		Contacto contacto1 = new Contacto("Juan", "Lopez", telef, 1.3);
		
		Contacto contacto2 = new Contacto("Juan", "Lopez", telef1, 1.3);
		
		AdminContactos admin=new AdminContactos();
		
		System.out.println(contacto1.getNombre());
		System.out.println(contacto1.getApellido());
		System.out.println(contacto1.getTelefono().getNumero());
		System.out.println(contacto1.getPeso());
		System.out.println(telef.isTieneWhatsapp());
		
		admin.activarUsuario(contacto1);
		admin.activarUsuario(contacto2);

		System.out.println("Contacto 1 Tiene whatsap: "+ telef.isTieneWhatsapp());
		System.out.println("Estado: "+ contacto1.isActivo());
		
		System.out.println("Contacto 2 Tiene whatsap: "+ telef1.isTieneWhatsapp());
		System.out.println("Estado: "+contacto2.isActivo());
		
		

	}
}
