package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion3 {

	public static void main(String[] args) {
		Connection conection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			conection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"Andypandy");
			System.out.println("conexion exitosa");

			ps = conection.prepareStatement(
					"insert into cuentas(numero_cuenta,cedula,fecha_creacion,saldo)" + "values(?,?,?,?)");

			ps.setString(1, "22222");
			ps.setString(2, "1111111111");

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

				ps.setDate(3, fechaSQL);

				ps.setBigDecimal(4, new BigDecimal(100));

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
