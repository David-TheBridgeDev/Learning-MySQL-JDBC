package com.example.JDBC;

import java.sql.*;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Haz un programa que muestre por pantalla para cada aeropuerto
		//(ordenados por su nombre) la informaci�n de los planes de vuelo que salen de cada uno

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
			Statement st2 = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from aeropuerto order by nombre;");

			while (rs.next()) {
				System.out.println("aeropuerto " + rs.getString("nombre"));
				ResultSet rs2 = st2.executeQuery("SELECT idvuelo, preciobase, maxpasajeros FROM planvuelo WHERE aero_salida =" + rs.getInt("idaero") + ";");

				while (rs2.next()) {
					System.out.println(rs2.getInt("idvuelo") + " " + rs2.getString(2) + " " + rs2.getInt(3));
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
