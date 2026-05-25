package com.example.JDBC;

import java.sql.*;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Muestra toda la informaci�n de los aeropuertos, suponiendo que no conocemos 
		//ni la cantidad ni los tipos de los atributos de dicha tabla 
		try {
			Connection con;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vuelos", "root", "");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM avion ");


			mostrarTabla(rs);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


	public static void mostrarTabla(ResultSet rs) {
		try {

			ResultSetMetaData mt = rs.getMetaData();

			System.out.println("El numero de columnas es: " + mt.getColumnCount());
			System.out.println("El nombre de la columnas es el siguiente: ");
			for (int i = 1; i <= mt.getColumnCount(); i++) {
				if (i > 1) System.out.print(" : ");
				System.out.print(mt.getColumnName(i) + " " + mt.getColumnTypeName(i));
			}
			System.out.println();

			System.out.println();
			System.out.println();

			int i;
			for (i = 1; i <= mt.getColumnCount(); i++) {

				if (i > 1) System.out.print(" : ");
				System.out.print(mt.getColumnLabel(i));

			}


			while (rs.next()) {

				for (i = 1; i <= mt.getColumnCount(); i++) {
					if (i > 1) System.out.print(" , ");
					System.out.print(rs.getString(i));
				}

				System.out.println("");
				// Fetch the next result set row
			}


		} catch (SQLException e) {
			e.printStackTrace();
		}


	}


}
