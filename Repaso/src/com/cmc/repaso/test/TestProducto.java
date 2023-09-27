package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto precio= new Producto("Arroz",100);

		precio.setPrecio();
		precio.calcularPrecioPromo(0.20);
	}

}
