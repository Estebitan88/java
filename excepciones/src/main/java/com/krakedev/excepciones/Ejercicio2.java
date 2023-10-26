package com.krakedev.excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {

	public void metodo1() {
		String a = null;
		a.substring(0);
		// NPE Uncheqked
	}

	public void metodo2() {
		File f= new File("archivo1.txt");
		try {
			f.createNewFile(); //IOExeption -cheked
		} catch (IOException io){
			System.out.println("Error");
			// TODO: handle exception
		}
		
	}

	public void metodo3() throws IOException {
		File f = new File("archivo1.txt");
		f.createNewFile(); // IOExeption -cheked
	}
	
	public void metodo4() throws IOException{
		metodo3();
	}

}
