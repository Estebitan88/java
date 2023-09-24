package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();

		auto1.marca = "Toyota";
		auto1.anio = 2020;
		auto1.precio = 20000;

		auto2.marca = "Lada";
		auto2.anio = 2010;
		auto2.precio = 10000;

		System.out.println("Auto 1 " + auto1.marca);
		System.out.println("Auto 1 " + auto1.anio);
		System.out.println("Auto 1 " + auto1.precio);

		System.out.println("---------------");

		
		System.out.println("Auto 2 " + auto2.marca);
		System.out.println("Auto 2 " + auto2.anio);
		System.out.println("Auto 2 " + auto2.precio);

	}

}
