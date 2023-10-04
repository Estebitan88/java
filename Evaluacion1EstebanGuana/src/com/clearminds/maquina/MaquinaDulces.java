package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

//	EJERCICIO 13

	public ArrayList<Producto> buscarMenores(double limite) {
		Celda elementocelda;
		ArrayList<Producto> productos = new ArrayList<Producto>();
		for (int i = 0; i < celdas.size(); i++) {
			elementocelda = celdas.get(i);
			if (elementocelda.getProducto() != null) {
				if (elementocelda.getProducto().getPrecio() <= limite) {
					productos.add(elementocelda.getProducto());
				}
			}
		}
		return productos;
	}

//	EJERCICIO 12

	public double venderConCambio(String codigo, double valorIngresado) {
		Celda celdaEncontrada = buscarCelda(codigo);
		for (int i = 0; i < celdas.size(); i++) {
			celdaEncontrada = celdas.get(i);
			vender(codigo);
		}

		double vuelto = valorIngresado - consultarPrecio(codigo);
		return vuelto;
	}

//	EJERCICIO 11

	public void vender(String codigo) {
		Celda celdaEncontrada = null;

		for (int i = 0; i < celdas.size(); i++) {
			celdaEncontrada = celdas.get(i);
		}
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		consultarPrecio(codigo);
		double precioProducto = consultarPrecio(codigo);
		setSaldo(saldo + precioProducto);
	}

//	EJERCICIO 10

	public void incrementarProductos(String codigo, int cantidad) {
		Celda celdaEncontrada = buscarCeldaProducto(codigo);
		celdaEncontrada.setStock(cantidad);
	}

//	EJERCICIO 9

	public Celda buscarCeldaProducto(String codigo) {
		Celda celdaContiene = null;
		for (int i = 0; i < celdas.size(); i++) {
			celdaContiene = celdas.get(i);

		}

		return celdaContiene;
	}

//	EJERCICIO 8
	public double consultarPrecio(String codigo) {
		Celda celdaEncontrada;
		double elementoEncontrado = 0.0;

		for (int i = 0; i < celdas.size(); i++) {
			celdaEncontrada = celdas.get(i);
			if (codigo.equals(celdaEncontrada.getCodigo())) {
				elementoEncontrado = celdaEncontrada.getProducto().getPrecio();
			}
		}
		return elementoEncontrado;
	}

//	EJERCICIO 7

	public Producto buscarProductoEnCelda(String codigo) {
		Celda productoGuardado;
//		productoGuardado = buscarCelda(codigo);
		for (int i = 0; i < celdas.size(); i++) {
			productoGuardado = celdas.get(i);
			if (codigo.equals(productoGuardado.getCodigo())) {

				System.out.println("Producto encontrado: " + productoGuardado.getProducto().getNombre());
			}

		}

		return null;
	}
	// EJERCICIO 6

	public void mostrarProductos() {
		Celda celdasEncontradas;
		for (int i = 0; i < celdas.size(); i++) {
			celdasEncontradas = celdas.get(i);
			if (celdasEncontradas.getProducto() == null) {
				System.out.println("Celda: " + celdas.get(i).getCodigo() + " Stock: " + celdas.get(i).getStock()
						+ " Sin producto asignado");
			} else {
				System.out.println("Celda: " + celdasEncontradas.getCodigo() + " Stock: " + celdasEncontradas.getStock()
						+ " Producto: " + celdasEncontradas.getProducto().getCodigo() + " Precio: "
						+ celdasEncontradas.getProducto().getPrecio());

			}
		}
		System.out.println("Saldo: " + getSaldo());
	}

	public void cargarProducto(Producto producto, String codigo, int items) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, items);
	}

//EJERCICIO 5
	public Celda buscarCelda(String codigo) {
		Celda celdaEncontrada = null;
		Celda codigoCelda = null;
		for (int i = 0; i < celdas.size(); i++) {
			codigoCelda = celdas.get(i);
			if (codigo.equals(codigoCelda.getCodigo())) {
				celdaEncontrada = codigoCelda;
			}
		}
		return celdaEncontrada;
	}

//	EJERCICIO 4

	public void mostrarConfiguracion() {
		Celda elementosCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementosCelda = celdas.get(i);
			System.out.println("celda: " + elementosCelda.getCodigo());
		}
	}

	public void agregarCelda(Celda codigo) {
		celdas.add(codigo);
	}

	// SET Y GET

	public ArrayList<Celda> getCeldas() {
		return celdas;
	}

	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
