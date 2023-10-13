package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {

	private ArrayList<Contacto> contactos;
	private ArrayList<Telefono> telefonos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;

	public Directorio() {
		contactos = new ArrayList<Contacto>();
		telefonos = new ArrayList<Telefono>();
		correctos = new ArrayList<Contacto>();
		incorrectos = new ArrayList<Contacto>();
	}

	public void depurar() {

		Contacto elementoContacto;

		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			if (elementoContacto.getDireccion() != null) {
				correctos.add(elementoContacto);
			}
		}

		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			if (elementoContacto.getDireccion() == null) {
				incorrectos.add(elementoContacto);
			}
		}
		contactos.clear();

	}

	public int contarFijos() {
		int numerosFijos = 0;
		Contacto elementoContacto;

		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			telefonos = elementoContacto.getTelefono();

			for (int j = 0; j < telefonos.size(); j++) {
				Telefono telefono = telefonos.get(j);
				if (telefono.getTipo().equals("Convencional")) {
					numerosFijos++;
				}
			}
		}

		return numerosFijos;
	}

	public int contarPerdidos() {
		Contacto elementoContacto;
		int sinDireccion = 0;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			if (elementoContacto.getDireccion() == null) {
				sinDireccion++;
			}

		}
		return sinDireccion;
	}

	public String consultarUltimaModificacion() {

		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Date fecha = new Date();
		String fechaFormateada = formatoFecha.format(fecha);

		return fechaFormateada;

	}

	public Contacto buscarPorCedula(String cedula) {

		Contacto elementoContactos;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContactos = contactos.get(i);
			if (cedula.equals(elementoContactos.getCedula())) {
				return elementoContactos;
			}
		}

		return null;
	}

	public boolean agregarContacto(Contacto contacto) {
		if (buscarPorCedula(contacto.getCedula()) == null) {
			contactos.add(contacto);
			return true;
		}
		return false;

	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

}
