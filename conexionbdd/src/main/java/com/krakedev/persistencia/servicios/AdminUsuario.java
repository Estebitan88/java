package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Usuario;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminUsuario {

	private static Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void insertar(Usuario usuario) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Usuaario a insertar---" + usuario);
		try {
			// abrir conexion
			con = ConexionBDD.conectar();

			ps = con.prepareStatement(
					"insert into usuario(cedula,nombre,apellido,tipo_cuenta,limite_credito)" + "values(?,?,?,?,?)");

			ps.setString(1, usuario.getCedula());
			ps.setString(2, usuario.getNombre());
			ps.setString(3, usuario.getApellido());
			ps.setString(4, usuario.getTipoCuenta());
			ps.setInt(5, usuario.getLimiteCredito());

			ps.executeUpdate();
			
			LOGGER.warn("usuario agregado correctamente---");

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

	public static void actualizar(Usuario usuario) throws Exception {

		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Usuario a actualizar---" + usuario);
		try {
			// abrir conexion
			con = ConexionBDD.conectar();

			ps = con.prepareStatement(

					"UPDATE usuario SET nombre=?, apellido=?, tipo_cuenta=?, limite_credito=? WHERE cedula=?");

			ps.setString(5, usuario.getCedula());
			ps.setString(1, usuario.getNombre());
			ps.setString(2, usuario.getApellido());
			ps.setString(3, usuario.getTipoCuenta());
			ps.setInt(4, usuario.getLimiteCredito());
			ps.executeUpdate();
			LOGGER.warn("usuario actualizado correctamente---");

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

					"DELETE FROM usuario WHERE cedula = ?");

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
