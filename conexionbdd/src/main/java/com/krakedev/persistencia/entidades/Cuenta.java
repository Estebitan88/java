package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Cuenta {

	private String numeroCuenta;
	private String cedula;
	private Date fechaCreacion;
	private BigDecimal saldo;
	
	
	
	

	public Cuenta(String numeroCuenta, String cedula, Date fechaCreacion, BigDecimal saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.cedula = cedula;
		this.fechaCreacion = fechaCreacion;
		this.saldo = saldo;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", cedula=" + cedula + ", fechaCreacion=" + fechaCreacion
				+ ", saldo=" + saldo + "]";
	}

}
