package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Cuenta;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminCuenta {

	private static Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void insertar(Cuenta cuenta) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Usuaario a cuenta---" + cuenta);
		try {
			// abrir conexion
			con = ConexionBDD.conectar();

			ps = con.prepareStatement(
					"insert into cuentas(numero_cuenta,cedula,fecha_creacion,saldo)" + "values(?,?,?,?)");

			ps.setString(1, cuenta.getNumeroCuenta());
			ps.setString(2, cuenta.getCedula());
			ps.setDate(3, new java.sql.Date(cuenta.getFechaCreacion().getTime()));
			ps.setBigDecimal(4, cuenta.getSaldo());

			ps.executeUpdate();

			LOGGER.warn("cuenta agregado correctamente---");

		} catch (Exception e) {

			// loggear el error
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}

		}

	}

	public static void actualizar(Cuenta cuenta) throws Exception {

		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("cuenta a actualizar---" + cuenta);
		try {
			// abrir conexion
			con = ConexionBDD.conectar();

			ps = con.prepareStatement(

					"UPDATE cuentas SET cedula=?, fecha_creacion=?, saldo=? WHERE numero_cuenta=?");

			ps.setString(1, cuenta.getCedula());
			ps.setString(4, cuenta.getNumeroCuenta());
			ps.setDate(2, new java.sql.Date(cuenta.getFechaCreacion().getTime()));
			ps.setBigDecimal(3, cuenta.getSaldo());

			ps.executeUpdate();
			LOGGER.warn("cuentas actualizado correctamente---");

		} catch (Exception e) {

			// loggear el error
			LOGGER.error("Error al actulizar", e);
			throw new Exception("Error al actulizar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}

		}

	}

	public static void eliminar(String cedula) throws Exception {

		Connection con = null;
		PreparedStatement ps;
		try {
			// abrir conexion
			con = ConexionBDD.conectar();

			ps = con.prepareStatement(

					"DELETE FROM cuentas WHERE cedula = ?");

			ps.setString(1, cedula);

			ps.executeUpdate();
			LOGGER.warn("Usuario eliminado correctamente---");

		} catch (Exception e) {

			// loggear el error
			LOGGER.error("Error al eliminar", e);
			throw new Exception("Error al eliminar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}

		}

	}

}
