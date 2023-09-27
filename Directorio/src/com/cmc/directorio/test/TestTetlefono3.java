package com.cmc.directorio.test;

import com.cm.directorio.entidades.AdminTelefono;
import com.cm.directorio.entidades.Telefono;

public class TestTetlefono3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int telefonos;
		
		Telefono telefono1=new Telefono("movi","099876",01);
		Telefono telefono2=new Telefono("claro","091234",02);
		Telefono telefono3=new Telefono("movi","09102939",03);
		
		AdminTelefono adm=new AdminTelefono();
		
		telefonos=adm.contarMovi(telefono1, telefono2, telefono3);
		
		System.out.println("Telefonos con operadora movi: "+telefonos);
		
		

	}

}
