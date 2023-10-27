package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

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
			LOGGER.warn("Persona actualizada correctamente---");

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
			LOGGER.warn("Persona eliminada correctamente---");

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

	public static ArrayList<Persona> buscarPorNombre(String nombreBusqueda) throws Exception {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("select * from personas where nombre like ?");
			ps.setString(1, "%" + nombreBusqueda + "%");

			rs = ps.executeQuery();

			// si solo se busca solo un elemento, devuelve una unica persona
//			if(rs.next()){
//			crea la persona y la retorna
//		}else{
//			return null
//		}	

			// si son varios elementos retorna un array list y se barren los elementos con
			// el while
			while (rs.next()) {

				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				Persona p = new Persona();
				p.setCedula(cedula);
				p.setNombre(nombre);
				personas.add(p);
			}

		} catch (Exception e) {
			// loggear el error
			LOGGER.error("Error al consultar por nombre", e);
			throw new Exception("Error al consultar por nombre");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}

		}
		return personas;

	}

	public static Persona buscarPorCedula(String numCedula) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Persona per;

		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("select * from personas where cedula = ?");
			ps.setString(1, numCedula);

			rs = ps.executeQuery();

			// si solo se busca solo un elemento, devuelve una unica persona
			if (rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				Persona p = new Persona();
				p.setCedula(cedula);
				p.setNombre(nombre);
				p.setApellido(apellido);

				return p;
			} else {

				return null;
			}

		} catch (Exception e) {
			// loggear el error
			LOGGER.error("Error al consultar por cedua", e);
			throw new Exception("Error al consultar por cedula");
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

	public static ArrayList<Persona> buscarPorApellido(String apellidoBusqueda) throws Exception {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("select * from personas where apellido like ?");
			ps.setString(1, "%" + apellidoBusqueda + "%");

			rs = ps.executeQuery();

			while (rs.next()) {

				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				Persona p = new Persona();
				p.setCedula(cedula);
				p.setNombre(nombre);
				p.setApellido(apellido);
				personas.add(p);
			}

		} catch (Exception e) {
			// loggear el error
			LOGGER.error("Error al consultar por apellido", e);
			throw new Exception("Error al consultar por apellido");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}

		}
		return personas;

	}

}
