package krakedev.entidades;

import java.util.ArrayList;

public class Curso {

	private ArrayList<Estudiante> estudiantes;

	public Curso() {
		estudiantes = new ArrayList<Estudiante>();
	}

	public void mostrar() {
		Estudiante elemetoEstudiante;
		for (int i = 0; i < estudiantes.size(); i++) {
			elemetoEstudiante = estudiantes.get(i);
			System.out.println("Nombre de la materia: " + estudiantes.get(i).getNotas().get(i).getMateria().getNombre()
					+ "" + " Calificaciones: " + estudiantes.get(i).getNotas().get(i).getCalificacion());
		}
	}

	public double calcularPromedioCurso() {
		Estudiante elementosEstudiantes;
		double sumarPromedio = 0.0;

		for (int i = 0; i < estudiantes.size(); i++) {
			elementosEstudiantes = estudiantes.get(i);
			sumarPromedio += elementosEstudiantes.calcularPromedioNotasEstudiante();
		}
		return sumarPromedio;

	}

	public void matricularEstudiante(Estudiante estudiante) {
		String estudianteEncontrado = buscarEstudiantePorCedula(estudiante);

		if (estudianteEncontrado == null) {
			estudiantes.add(estudiante);
		} else {
			System.out.println("El estudiante ya esta matriculado");
		}

	}

	public String buscarEstudiantePorCedula(Estudiante estudiante) {

		String mensaje = "El estudiante ya esta matriculado";
		Estudiante elementoEstudiante;

		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEstudiante = estudiantes.get(i);
			if (estudiante.getCedula().equals(elementoEstudiante.getCedula())) {
				return mensaje;
			}
		}
		return null;
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

}
