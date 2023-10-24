package com.krakedev.herencia;

public class Gato extends Animal {

	@Override 
	public void dormir() {
		System.out.println("Cualquier mensaje");
	}
	

    public void dormir(String accion) {
        System.out.println("Gato durmiendo " + accion);
    }
}


