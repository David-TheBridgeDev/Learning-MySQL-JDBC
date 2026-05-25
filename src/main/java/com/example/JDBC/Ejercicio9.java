package com.example.JDBC;

import java.sql.*;


public class Ejercicio9 {

	public static void main(String[] args) {
		// Haz un programa que muestre la estructura de la tabla aeropuerto por pantalla

		try {

			Connection con;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vuelos", "root", "");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM aeropuerto");

			ResultSetMetaData metadata = rs.getMetaData();

			System.out.println("El numero de columnas es: " + metadata.getColumnCount());
			System.out.println("El nombre de la columnas es el siguiente: ");
			for (int i = 1; i <= metadata.getColumnCount(); i++) {
				System.out.println(metadata.getColumnName(i) + " " + metadata.getColumnTypeName(i));
			}


		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
