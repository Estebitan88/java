package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();

		productoA.setNombre("termometro");
		productoA.setDescripcion("Termometro digital");
		productoA.setPrecio(5.00);
		productoA.setStockActual(10);

		productoB.setNombre("ibuproofeno");
		productoB.setDescripcion("pastilla para la fiebre");
		productoB.setPrecio(0.50);
		productoB.setStockActual(40);

		productoC.setNombre ("paracetamol");
		productoC.setDescripcion("pastilla para los dolores");
		productoC.setPrecio (0.30);
		productoC.setStockActual(60);

		System.out.println("--------PRODUCTO A------------");

		System.out.println("Nombre: " + productoA.getNombre());
		System.out.println("Descripcion: " + productoA.getDescripcion());
		System.out.println("Precio: " + productoA.getPrecio());
		System.out.println("Stock actual: " + productoA.getStockActual());

		System.out.println("-------PRODUCTO B-------------");

		System.out.println("Nombre: " + productoB.getNombre());
		System.out.println("Descripcion: " + productoB.getDescripcion());
		System.out.println("Precio: " + productoB.getPrecio());
		System.out.println("Stock actual: " + productoB.getStockActual());

		System.out.println("---------PRODUCTO C-----------");

		System.out.println("Nombre: " + productoC.getNombre());
		System.out.println("Descripcion: " + productoC.getDescripcion());
		System.out.println("Precio: " + productoC.getPrecio());
		System.out.println("Stock actual: " + productoC.getStockActual());

	}

}
