package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto p1=new Producto(001,"Azucar");
		
		p1.setDescripcion("Azucar morena");
		p1.setPeso(10);
		
		System.out.println("Codigo: "+ p1.getCodigo());
		System.out.println("Nombre del producto: "+ p1.getNombre());
		System.out.println("Descripción: "+ p1.getDescripcion());
		System.out.println("Peso: "+ p1.getPeso());

	}

}
