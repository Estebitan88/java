package com.cmc.directorio.test;

import com.cm.directorio.entidades.AdminContactos;
import com.cm.directorio.entidades.Contacto;
import com.cm.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contacto masPesado;
		boolean operadora;

		AdminContactos admin=new AdminContactos();
		
		Telefono telef = new Telefono("claro", "123456", 1);
		Telefono telef1 = new Telefono("claro", "123456", 1);
		
		Contacto contacto1=new Contacto("Esteban", "Chico", telef, 1.5);
		Contacto contacto2=new Contacto("Maria", "Perez", telef1, 1.6);
		
		
		masPesado=admin.buscarMasPesado(contacto1, contacto2);
		
		System.out.println("El contacto mas pesado es: "+masPesado.getNombre()+" "+masPesado.getApellido());
		System.out.println("El peso es: "+masPesado.getPeso());
		System.out.println("El telefono es: "+masPesado.getTelefono().getNumero());
		
		operadora=admin.compararOperadoras(contacto1, contacto2);
		
		System.out.println("Las operadoras son iguales? "+operadora);

	}

}
