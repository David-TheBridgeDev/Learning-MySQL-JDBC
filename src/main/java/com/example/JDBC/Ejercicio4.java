package com.example.JDBC;

import java.sql.*;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Haz un programa que muestre por pantalla el n�mero de tuplas que tiene la tabla embarcaci�n 

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
			ResultSet rs = stmt.executeQuery("SELECT count(*) FROM avion");

			while (rs.next()) {
				int x = rs.getInt(1);
				System.out.println("El numero de tuplas de la tabla avion es: " + x);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
