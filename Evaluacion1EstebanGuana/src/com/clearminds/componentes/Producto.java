package com.clearminds.componentes;

public class Producto {

	private String nombre;
	private double precio;
	private String codigo;

	public void incrementarPrecio(int porcentajeIncremento) {
		double totalIncremento = (porcentajeIncremento * precio)/100;
		precio = totalIncremento + precio;
	}

	public void disminuirPrecio(double valorDescuento) {
		precio = precio - valorDescuento;
	}

	public Producto(String codigo, String nombre, double precio) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
