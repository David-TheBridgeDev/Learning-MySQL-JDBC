package com.example.JDBC;

import java.sql.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Haz un programa que muestre por pantalla para cada tipo de avi�n el n�mero de aviones de dicho tipo

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
			ResultSet rs = stmt.executeQuery("SELECT idtipo, count(idavion) from avion group by idtipo");

			while (rs.next()) {
				String s = rs.getString(1);
				int x = rs.getInt(2);

				System.out.println(" " + s + " " + x);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
