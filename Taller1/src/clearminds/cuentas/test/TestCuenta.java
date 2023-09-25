package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuenta cuenta1 = new Cuenta("03476");
		Cuenta cuenta2 = new Cuenta("03476", "C", 98);
		Cuenta cuenta3 = new Cuenta("03476");
		Cuenta cuenta4 = new Cuenta("0987");
		Cuenta cuenta5 = new Cuenta("0557", "C", 10);
		Cuenta cuenta6 = new Cuenta("0666", "A", 0);

		cuenta1.setSaldo(675);
		cuenta3.setTipo("C");
		cuenta4.setTipo("A");
		cuenta4.setSaldo(10);

		System.out.println("----Valores Iniciales-----");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();

		System.out.println("----Valores modificados-----");

		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");

		System.out.println("Nuevos valores cuenta 1: " + cuenta1.getSaldo());
		System.out.println("Nuevos valores cuenta 2: " + cuenta2.getTipo());
		System.out.println("Nuevos valores cuenta 3: " + cuenta3.getSaldo());

		System.out.println(" ");
		System.out.println("******Valores Con Mi Estilo*******");
		System.out.println(" ");
		
		System.out.println(" ");
		System.out.println("******Cuenta 4*******");
		System.out.println(" ");
		cuenta4.imprimirConMiEstilo();
		System.out.println(" ");
		System.out.println("******Cuenta 5*******");
		System.out.println(" ");
		cuenta5.imprimirConMiEstilo();
		System.out.println(" ");
		System.out.println("******Cuenta 6*******");
		System.out.println(" ");
		cuenta6.imprimirConMiEstilo();

	}

}
