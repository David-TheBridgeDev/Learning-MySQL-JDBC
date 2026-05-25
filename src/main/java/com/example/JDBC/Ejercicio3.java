package com.example.JDBC;

import java.sql.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Escribe un programa  que muestre los nombres de todos los aeropuertos por pantalla

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}


		String url = "jdbc:mysql://localhost:3306/vuelos";

		Connection con;
		try {

			con = DriverManager.getConnection(url, "root", "");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT nombre FROM aeropuerto");

			while (rs.next()) {
				String x = rs.getString(1);
				System.out.println(x);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
