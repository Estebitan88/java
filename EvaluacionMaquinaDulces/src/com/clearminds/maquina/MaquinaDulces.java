package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4) {
		this.celda1 = new Celda(codigo1);
		this.celda2 = new Celda(codigo2);
		this.celda3 = new Celda(codigo3);
		this.celda4 = new Celda(codigo4);
	}

	public void mostrarConfiguracion() {
		System.out.println("Celda 1: " + celda1.getCodigo());
		System.out.println("Celda 2: " + celda2.getCodigo());
		System.out.println("Celda 3: " + celda3.getCodigo());
		System.out.println("Celda 4: " + celda4.getCodigo());
		System.out.println("Saldo: " + saldo);
	}

	public Celda buscarCelda(String celCodigo) {
		if (celCodigo == celda1.getCodigo()) {
			return celda1;
		} else if (celCodigo == celda2.getCodigo()) {
			return celda2;
		} else if (celCodigo == celda3.getCodigo()) {
			return celda3;
		} else if (celCodigo == celda4.getCodigo()) {
			return celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto atributo, String codigo, int items) {

		Celda celdaRecuperada = buscarCelda(codigo);

		celdaRecuperada.ingresarProducto(atributo, items);
	}

	public void mostrarProductos() {
		System.out.println("**********CELDA " + celda1.getCodigo());
		System.out.println("Stock: " + celda1.getStock());
		if (celda1.getProducto() == null) {
			System.out.println("La celda no tiene producto");
		} else {
			System.out.println("Nombre Producto: " + celda1.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda1.getProducto().getPrecio());
			System.out.println("Código Producto: " + celda1.getProducto().getCodigo());
		}

		System.out.println("**********CELDA " + celda2.getCodigo());
		System.out.println("Stock: " + celda2.getStock());
		if (celda2.getProducto() == null) {
			System.out.println("La celda no tiene producto");
		} else {
			System.out.println("Nombre Producto: " + celda2.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda2.getProducto().getPrecio());
			System.out.println("Código Producto: " + celda2.getProducto().getCodigo());
		}

		System.out.println("**********CELDA " + celda3.getCodigo());
		System.out.println("Stock: " + celda3.getStock());
		if (celda3.getProducto() == null) {
			System.out.println("La celda no tiene producto");
		} else {
			System.out.println("Nombre Producto: " + celda3.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda3.getProducto().getPrecio());
			System.out.println("Código Producto: " + celda3.getProducto().getCodigo());
		}

		System.out.println("**********CELDA " + celda4.getCodigo());
		System.out.println("Stock: " + celda4.getStock());
		if (celda4.getProducto() == null) {
			System.out.println("La celda no tiene producto");
		} else {
			System.out.println("Nombre Producto: " + celda4.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda4.getProducto().getPrecio());
			System.out.println("Código Producto: " + celda4.getProducto().getCodigo());
		}
		System.out.println("Saldo: "+ getSaldo());

	}

	public Producto buscarProductoEnCelda(String celCodigo) {
		if (celCodigo == celda1.getCodigo()) {
			return celda1.getProducto();
		} else if (celCodigo == celda2.getCodigo()) {
			return celda2.getProducto();
		} else if (celCodigo == celda3.getCodigo()) {
			return celda3.getProducto();
		} else if (celCodigo == celda4.getCodigo()) {
			return celda4.getProducto();
		} else {
			return null;
		}
	}

	public double consultarPrecio(String celCodigo) {
		if (celCodigo == celda1.getCodigo()) {
			return celda1.getProducto().getPrecio();
		} else if (celCodigo == celda2.getCodigo()) {
			return celda2.getProducto().getPrecio();
		} else if (celCodigo == celda3.getCodigo()) {
			return celda3.getProducto().getPrecio();
		} else if (celCodigo == celda4.getCodigo()) {
			return celda4.getProducto().getPrecio();
		} else
			return 0.0;

	}

	public Celda buscarCeldaProducto(String codProducto) {
		if (celda1.getProducto() != null && codProducto == celda1.getProducto().getCodigo()) {
			return celda1;
		}
		if (celda2.getProducto() != null && codProducto == celda2.getProducto().getCodigo()) {
			return celda2;
		}
		if (celda3.getProducto() != null && codProducto == celda3.getProducto().getCodigo()) {
			return celda3;
		}
		if (celda4.getProducto() != null && codProducto == celda4.getProducto().getCodigo()) {
			return celda4;
		}
		return null;
	}

	public void incrementarProductos(String codProducto, int items) {
		Celda celdaEncontrada = buscarCeldaProducto(codProducto);
		celdaEncontrada.setStock(items + celdaEncontrada.getStock());
	}

	public void vender(String codCelda) {
		Celda cel = buscarCelda(codCelda);
		cel.setStock(cel.getStock() - 1);

		double precioProducto = consultarPrecio(codCelda);
		setSaldo(getSaldo() + precioProducto);

//		mostrarProductos();
		
	}

	public double venderConCambio(String codCelda, double valorIngresado) {
		Celda celdaEncontrada= buscarCelda(codCelda);	
		vender(codCelda);	

		double vuelto =valorIngresado-consultarPrecio(codCelda);
		return vuelto;
	}

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
