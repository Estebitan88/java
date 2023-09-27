package com.cmc.repaso.entidades;

public class Producto {

	private String nombre;
	private double precio;

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		System.out.println("Nombre del producto: "+nombre);
		System.out.println("Precio del producto: "+precio);
	}

	public void setPrecio() {

		if (precio > 0) {

			System.out.println(precio+ " Si es mayor a 0: ");
		} else {
			precio = precio * -1;
			System.out.println("Valor transformado a positivo: "+ precio);
		}

	}

	public double calcularPrecioPromo(double porcentajeDescuento) {
		double precioConDescuento;

		precioConDescuento = precio * porcentajeDescuento;
		
		System.out.println("Valor de descuento: "+precioConDescuento);
		System.out.println("Valor total con descuento: "+ (precio-precioConDescuento));
		
		return precioConDescuento;
	}

}
