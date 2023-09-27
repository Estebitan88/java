package com.cmc.repaso.entidades;

public class Estudiante {
	
	private String nombre;
	private double nota;
	private String resultado;	
	
	public Estudiante(String nombre) {
		this.nombre=nombre;
		System.out.println("Nombre del estudiante: "+nombre);
	}
	
	public void Calificar(double nota) {
		this.nota=nota;
		if(nota<8) {
			this.resultado="F";
			System.out.println("Calificacion: "+resultado);
		}else if(nota>=8) {
			this.resultado="A";
			System.out.println("Calificacion: "+resultado);
		}
	}

}
