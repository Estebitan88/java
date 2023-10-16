package com.krakedev.entidades;

public class Random {

	public static int obtenerPosicion() {
		int numRandom = (int) (Math.random() * 51 + 1);
		return numRandom;
	}

}
