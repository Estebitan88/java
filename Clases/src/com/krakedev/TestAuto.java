package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1 = new Auto("Toyota",2020,200000);
		Auto auto2 = new Auto("Lada",2010,100000);

//		auto1.setMarca("Toyota");
//		auto1.setAnio(2020);
//		auto1.setPrecio(20000);
//
//		auto2.setMarca("Lada");
//		auto2.setAnio(2010);
//		auto2.setPrecio(10000);

		System.out.println("Auto 1 " + auto1.getMarca());
		System.out.println("Auto 1 " + auto1.getAnio());
		System.out.println("Auto 1 " + auto1.getPrecio());

		System.out.println("---------------");

		
		System.out.println("Auto 2 " + auto2.getMarca());
		System.out.println("Auto 2 " + auto2.getAnio());
		System.out.println("Auto 2 " + auto2.getPrecio());

	}

}
