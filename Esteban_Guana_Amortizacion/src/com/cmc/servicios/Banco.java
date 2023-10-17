package com.cmc.servicios;

import java.util.ArrayList;

import com.cmc.entidades.Cliente;
import com.cmc.evaluacion.CalculadoraAmortizacion;
import com.cmc.evaluacion.Prestamo;

public class Banco {
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Cliente> clientes;

	public Banco() {
		prestamos = new ArrayList<Prestamo>();
		clientes = new ArrayList<Cliente>();
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente buscarCliente(String cedula) {
		Cliente elementoCliente = null;
		Cliente clienteEncontrado = null;
		for (int i = 0; i < clientes.size(); i++) {
			elementoCliente = clientes.get(i);
			
			if (cedula.equals(elementoCliente.getCedula())) {
				clienteEncontrado = elementoCliente;
			}
		}
		return clienteEncontrado;
	}

	public void registrarCliente(Cliente cliente) {
		if (buscarCliente(cliente.getCedula()) == null) {
			clientes.add(cliente);
		} else {
			System.out.println("Cliente ya existente " + cliente.getCedula());
		}

	}

	public void asignarPrestamo(String cedula, Prestamo prestamo) {
		Cliente cliente = buscarCliente(cedula);
		if (cliente == null) {
			System.out.println("El cliente con cédula " + cedula + " no es cliente del banco.");
		} else {
			prestamo.setCliente(cliente);
			CalculadoraAmortizacion.generarTabla(prestamo);
			prestamos.add(prestamo);
		}
	}

	public ArrayList<Prestamo> buscarPrestamos(String cedula) {

		Cliente cliente = buscarCliente(cedula);
		ArrayList<Prestamo> prestamoEncontrado = new ArrayList<Prestamo>();
		if (cliente != null) {
			Prestamo elementoPrestamo;
			for (int i = 0; i < prestamos.size(); i++) {
				elementoPrestamo = prestamos.get(i);
				if (elementoPrestamo.getCliente() == cliente) {
					prestamoEncontrado.add(elementoPrestamo);
				}
			}
			if (prestamoEncontrado.isEmpty()) {
				return null;
			} else {
				return prestamoEncontrado;
			}

		} else {
			return null;
		}
	}
	
}
