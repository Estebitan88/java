package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {

	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;
	private Directorio directorio;

	public Contacto(String cedula, String nombre, String apellido, Direccion direccion) {

		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefonos = new ArrayList<>();

	}

	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;

	}

	public ArrayList<Telefono> recuperarIncorrectos() {

		Telefono elementoTelefonos = null;
		ArrayList<Telefono> incorrectos = new ArrayList<Telefono>();

		for (int i = 0; i < telefonos.size(); i++) {
			elementoTelefonos = telefonos.get(i);

			if (elementoTelefonos.getEstado().equals("E")) {
				incorrectos.add(elementoTelefonos);

			}
		}
		return incorrectos;

	}

	public void mostrarTelefonos() {

		Telefono elementoTelefonos = null;
		System.out.println("Telefonos con estado tipo 'C' : ");
		for (int i = 0; i < telefonos.size(); i++) {
			elementoTelefonos = telefonos.get(i);

			if (telefonos.get(i).getEstado().equalsIgnoreCase("C")) {

				System.out.println("Numero: " + elementoTelefonos.getNumero() + ", Tipo: " + elementoTelefonos.getTipo()
						+ " Estado: " + elementoTelefonos.getEstado());
			}

		}
	}

	public void agregarTelefono(Telefono telefono) {

		telefonos.add(telefono);
	}

	public void imprimir() {
		System.out.println("Cedula: " + getCedula() + "\n" + "Nombre: " + getNombre() + "\n" + "Apellido: "
				+ getApellido() + "\n" + "Direccion: \n" + "   Calle principal: " + getDireccion().getCallePrincipal()
				+ "\n" + "   Calle secundaria: " + getDireccion().getCalleSecundaria());
	}

	public void imprimir2() {

		System.out.println(
				"***Rosa Chavez*****" + "\n" + "Direccion: " + "Calle principal: " + getDireccion().getCallePrincipal()
						+ "\n" + " ***Ernesto Montoya***\n" + "No tiene asociada una direccion");
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefono() {
		return telefonos;
	}

	public void setTelefono(ArrayList<Telefono> telefono) {
		this.telefonos = telefono;
	}

}
