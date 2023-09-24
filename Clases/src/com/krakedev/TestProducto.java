package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();

		productoA.nombre = "termometro";
		productoA.descripcion = "Termometro digital";
		productoA.precio = 5.00;
		productoA.stockActual = 10;

		productoB.nombre = "ibuproofeno";
		productoB.descripcion = "pastilla para la fiebre";
		productoB.precio = 0.50;
		productoB.stockActual = 40;

		productoC.nombre = "paracetamol";
		productoC.descripcion = "pastilla para los dolores";
		productoC.precio = 0.30;
		productoC.stockActual = 60;

		System.out.println("--------PRODUCTO A------------");

		System.out.println("Nombre: " + productoA.nombre);
		System.out.println("Descripcion: " + productoA.descripcion);
		System.out.println("Precio: " + productoA.precio);
		System.out.println("Stock actual: " + productoA.stockActual);

		System.out.println("-------PRODUCTO B-------------");

		System.out.println("Nombre: " + productoB.nombre);
		System.out.println("Descripcion: " + productoB.descripcion);
		System.out.println("Precio: " + productoB.precio);
		System.out.println("Stock actual: " + productoB.stockActual);

		System.out.println("---------PRODUCTO C-----------");

		System.out.println("Nombre: " + productoC.nombre);
		System.out.println("Descripcion: " + productoC.descripcion);
		System.out.println("Precio: " + productoC.precio);
		System.out.println("Stock actual: " + productoC.stockActual);

	}

}
