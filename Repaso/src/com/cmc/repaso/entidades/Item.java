package com.cmc.repaso.entidades;

public class Item {
	
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	

	
	public Item(String nombre, int productosActuales, int productosDevueltos, int productosVendidos) {
		this.nombre = nombre;
		this.productosActuales = productosActuales;
		this.productosDevueltos = productosDevueltos;
		this.productosVendidos = productosVendidos;
	}

	public void imprimir() {
		System.out.println("-----------------------------");
		System.out.println("NOMBRE DEL PRODUCTO: "+nombre);
		
		System.out.println("PRODUCTOS ACTUALES: "+productosActuales);
		System.out.println("PRODUCTOS DEVUELTOS: "+productosDevueltos);
		System.out.println("PRODUCTOS VENDIDOS: "+productosVendidos);
	}
	
	public void vender(int productosVendidos) {
		System.out.println("-----------------------------");
		System.out.println("PRODUCTOS VENDIDOS: "+productosVendidos);
		this.productosActuales=productosActuales-productosVendidos;
		this.productosVendidos=this.productosVendidos+productosVendidos;
	}
	
	public void devolver(int productosVendidos) {
		System.out.println("-----------------------------");
		System.out.println("PRODUCTOS DEVUELTOS: "+productosVendidos);
		this.productosActuales=productosActuales+productosVendidos;
		this.productosVendidos=this.productosVendidos-productosVendidos;
		this.productosDevueltos=this.productosDevueltos+productosVendidos;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}
	
	

}
