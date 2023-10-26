package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		Connection conection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			conection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"Andypandy");
			System.out.println("conexion exitosa");

			ps = conection.prepareStatement(
					"insert into persona(cedula,nombre,apellido,estado_civil_codigo,numero_hijos,estatura,cantidad_a,"
					+ "fecha_nacimiento,hora_nacimiento)"
							+ "values(?,?,?,?,?,?,?,?,?)");

			ps.setString(1, "0201813573");
			ps.setString(2, "Rosalia");
			ps.setString(3, "Perez");
			ps.setString(4, "U");
			ps.setInt(5, 2);
			ps.setDouble(6, 1.56);
			ps.setBigDecimal(7, new BigDecimal(1200.45));

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");

			String fechaStr = "2020/03/22 10:05:04";

			try {
				Date fecha = sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMilis = fecha.getTime();
				System.out.println(fechaMilis);

				// crea un java.sqlDate, partiendo de un java.util.Date
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);

				Time timeSQL = new Time(fechaMilis);
				System.out.println(timeSQL);

				ps.setDate(8, fechaSQL);
				ps.setTime(9, timeSQL);

				ps.executeUpdate();
				System.out.println("Executa insert");
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
