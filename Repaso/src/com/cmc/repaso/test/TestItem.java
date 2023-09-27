package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item item=new Item("Azucar",0,10,5);
		Item item1=new Item("Sal",0,10,5);
		
		System.out.println(" ");
		System.out.println("********** PRODUCTO 1 **************");
		System.out.println(" ");
		
		
	item.setProductosActuales(20);
	
	item.imprimir();
	
	item.vender(2);
	item.imprimir();
	
	item.devolver(1);
	item.imprimir();
	
	System.out.println(" ");
	System.out.println("********** PRODUCTO 2 **************");
	System.out.println(" ");
	
item1.setProductosActuales(20);
	
	item1.imprimir();
	
	item1.vender(4);
	item1.imprimir();
	
	item1.devolver(1);
	item1.imprimir();

	}

}
