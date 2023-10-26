package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	private static Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void insertar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a insertar---" + persona);
		try {
			// abrir conexion
			con = ConexionBDD.conectar();

			ps = con.prepareStatement(
					"insert into persona(cedula,nombre,apellido,estado_civil_codigo,numero_hijos,estatura,cantidad_a,"
							+ "fecha_nacimiento,hora_nacimiento)" + "values(?,?,?,?,?,?,?,?,?)");

			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setString(4, persona.getEstadoCivil().getCodigo());
			ps.setInt(5, persona.getNumeroHijos());
			ps.setDouble(6, persona.getEstatura());
			ps.setBigDecimal(7, persona.getCantidadAhorrada());
			ps.setDate(8, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(9, new Time(persona.getHoraNacimiento().getTime()));
			ps.executeUpdate();

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

	public static void actualizar(Persona persona) throws Exception {

		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a actualizar---" + persona);
		try {
			// abrir conexion
			con = ConexionBDD.conectar();

			ps = con.prepareStatement(
					
					"UPDATE persona SET nombre=?, apellido=?, estado_civil_codigo=?, numero_hijos=?, estatura=?, "
					+ "cantidad_a=?, fecha_nacimiento=?, hora_nacimiento=? WHERE cedula=?");
					

			ps.setString(9, persona.getCedula());
			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setString(3, persona.getEstadoCivil().getCodigo());
			ps.setInt(4, persona.getNumeroHijos());
			ps.setDouble(5, persona.getEstatura());
			ps.setBigDecimal(6, persona.getCantidadAhorrada());
			ps.setDate(7, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(8, new Time(persona.getHoraNacimiento().getTime()));
			ps.executeUpdate();
			LOGGER.warn("Persona actualizada correctamente---" );

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
					
					"DELETE FROM persona WHERE cedula = ?");
					

			ps.setString(1, cedula);
			
			ps.executeUpdate();
			LOGGER.warn("Persona eliminada correctamente---" );

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
