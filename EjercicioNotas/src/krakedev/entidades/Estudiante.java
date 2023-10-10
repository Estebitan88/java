package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {

	private String nombre;
	private String apellido;
	private String cedula;

	private ArrayList<Nota> notas;

	private ArrayList<Estudiante> estudiantes;

	public Estudiante(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.notas = new ArrayList<>();
		this.estudiantes = new ArrayList<>();
	}

	public Estudiante() {
		estudiantes = new ArrayList<Estudiante>();

	}

	public void mostrar() {
		System.out.println("***METODO MOSTRAR");

		for (int i = 0; i < notas.size(); i++) {
			Nota elementosNotas = notas.get(i);
			System.out.println("Nombre: " + getNombre() + " Apellido: " + getApellido() + " Cedula: " + getCedula()
					+ " Calificacion: " + elementosNotas.getCalificacion() + " Materia: "
					+ elementosNotas.getMateria().getNombre() + " Codigo de la materia: "
					+ elementosNotas.getMateria().getCodigo());
		}

	}

	public double calcularPromedioNotasEstudiante() {
		System.out.println("***CALCULAR PROMEDIO NOTAS ESTUDIANTE");
		double sumarNotas = 0.0;
		double promedio;
		for (int i = 0; i < notas.size(); i++) {
			Nota elementoNotas = notas.get(i);
			sumarNotas += notas.get(i).getCalificacion();
		}
		promedio = sumarNotas / notas.size();
		return promedio;
	}

	public void modificarNota(String codigo, double nuevaNota) {
		System.out.println("***MODIFICAR NOTA");
		if (nuevaNota >= 0.0 && nuevaNota <= 10.0) {
			for (int i = 0; i < notas.size(); i++) {
				Nota elementoNotas = notas.get(i);
				if (codigo.equals(elementoNotas.getMateria().getCodigo())) {
					System.out.println("La nota se cambio exitosamente: " + nuevaNota);
				}
			}
		} else {
			System.out.println("La nota: " + nuevaNota + " tiene que ser mayor o igual a 0 y menor igual que 10");
		}

	}

	public void agregarNota(Nota nuevaNota) {
		System.out.println("***AGREGAR NUEVA NOTA");
		if (nuevaNota.getCalificacion() >= 0.0 && nuevaNota.getCalificacion() <= 10.0) {
			for (int i = 0; i < notas.size(); i++) {
				Nota elementoNotas = notas.get(i);
				if (elementoNotas.getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo())) {
					System.out.println("Ya existe una nota con el código " + nuevaNota.getMateria().getCodigo() + "."
							+ nuevaNota.getMateria().getNombre());
					return;
				}
			}
			notas.add(nuevaNota);
			System.out.println("Nueva nota añadida correctamente.");
		} else {
			System.out.println("Error: La nueva nota debe ser mayor o igual a 0 y menor o igual a 10.");
		}
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

}
