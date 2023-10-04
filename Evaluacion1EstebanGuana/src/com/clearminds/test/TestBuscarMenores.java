package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {
	public static void main(String[] args) {

		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1"));
		maquina.agregarCelda(new Celda("A2"));
		maquina.agregarCelda(new Celda("B1"));
		maquina.agregarCelda(new Celda("B2"));
		maquina.agregarCelda(new Celda("C1"));
		maquina.agregarCelda(new Celda("C2"));

		Producto producto = new Producto("ARR34", "Arroz", 0.85);
		maquina.cargarProducto(producto, "A1", 4);
		Producto producto1 = new Producto("AZ34", "Azucar", 0.75);
		maquina.cargarProducto(producto1, "A2", 4);
		Producto producto2 = new Producto("PA34", "Pan", 0.50);
		maquina.cargarProducto(producto2, "B1", 4);
		Producto producto3 = new Producto("LE34", "Leche", 0.90);
		maquina.cargarProducto(producto3, "B2", 4);
		Producto producto4 = new Producto("CA34", "Cafe", 1.00);
		maquina.cargarProducto(producto4, "C1", 4);
		Producto producto5 = new Producto("MA34", "Mantequilla", 1.50);
		maquina.cargarProducto(producto5, "C2", 4);


		ArrayList<Producto> productoMenor = maquina.buscarMenores(0.85);
		System.out.println("Productos Menores: " + productoMenor.size());
		
		for (int i = 0; i < productoMenor.size(); i++) {
			String productosEncontrados= productoMenor.get(i).getNombre();
			Double precioProductosEncontrados= productoMenor.get(i).getPrecio();
			System.out.println("Nombre: "+productosEncontrados+" Precio: "+precioProductosEncontrados );
		}
		
	}
}
