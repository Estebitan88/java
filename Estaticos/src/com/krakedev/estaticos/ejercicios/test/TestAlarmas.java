package com.krakedev.estaticos.ejercicios.test;

import java.util.ArrayList;
import java.util.List;

import com.krakedev.estaticos.DiasSemanas;
import com.krakedev.estaticos.ejercicios.entidades.Alarma;
import com.krakedev.estaticos.ejercicios.logica.AdminAlarmas;

public class TestAlarmas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminAlarmas admin= new AdminAlarmas();
		
		ArrayList<Alarma>alarmaActuales=admin.getAlarmas();
		
	     Alarma alarma1 = new Alarma(DiasSemanas.LUNES, 6, 30);
	     Alarma alarma2 = new Alarma(DiasSemanas.MARTES, 7, 30);
	     
	     admin.agregarAlarma(alarma1);
	        admin.agregarAlarma(alarma2);
	   
	        ArrayList<Alarma> listaAlarmas = admin.obtenerListaAlarmas();

	        for (Alarma alarma : listaAlarmas) {
	            System.out.println(alarma);
	        }
	        System.out.println("Entra al toString");
	        System.out.println(alarmaActuales);
	    }
	}