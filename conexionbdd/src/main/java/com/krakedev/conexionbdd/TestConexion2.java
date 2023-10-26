package com.krakedev.conexionbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestConexion2 {

	public static void main(String[] args) {
		Connection conection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			conection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"Andypandy");
			System.out.println("conexion exitosa");

			ps = conection.prepareStatement(
					"insert into usuario(cedula,nombre,apellido,tipo_cuenta,limite_credito)" + "values(?,?,?,?,?)");

			ps.setString(1, "1111111111");
			ps.setString(2, "Pilar");
			ps.setString(3, "Paredes");
			ps.setString(4, "corriente");
			ps.setInt(5, 50);

			ps.executeUpdate();
			System.out.println("Executa insert");

		} catch (ClassNotFoundException |

				SQLException e) {
			e.printStackTrace();
		}

	}

}
