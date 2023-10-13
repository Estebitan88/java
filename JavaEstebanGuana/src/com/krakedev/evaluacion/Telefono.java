package com.krakedev.evaluacion;

public class Telefono {

	private String numero;
	private String tipo;
	private String estado;

	public Telefono(String numero, String tipo) {
		super();
		this.numero = numero;
		this.tipo = tipo;

		if (tipo != null && tipo.equals("Movil")) {
			if ((numero != null) && (numero.length() >= 0 && numero.length() <= 10)) {
				this.numero = numero;
				this.tipo = tipo;
				this.estado = "C";
			} else {
				this.numero = numero;
				this.tipo = tipo;
				this.estado = "E";
			}
		} else if (tipo != null && tipo.equals("Convencional")) {
			if ((numero != null) && (numero.length() >= 0 && numero.length() <= 7)) {
				this.numero = numero;
				this.tipo = tipo;
				this.estado = "C";
			} else {
				this.numero = numero;
				this.tipo = tipo;
				this.estado = "E";
			}
		} else {
			this.numero = numero;
			this.tipo = tipo;
			this.estado = "E";
		}
	}

	public String getNumero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}

	public String getEstado() {
		return estado;
	}

}
