package com.cmc.directorio.test;

import com.cm.directorio.entidades.AdminTelefono;
import com.cm.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int telefonos;
		
		Telefono telefono1=new Telefono("claro","099876",01);
		Telefono telefono2=new Telefono("claro","091234",02);
		Telefono telefono3=new Telefono("movi","09102939",03);
		Telefono telefono4=new Telefono("claro","0991234",04);
		
		AdminTelefono adm=new AdminTelefono();
		
		telefonos=adm.contarClaro(telefono1, telefono2, telefono3,telefono4);
		
		System.out.println("Telefonos con operadora claro: "+telefonos);
		

	}

}
