package com.example.JDBC;

import java.sql.*;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// Haz un programa que muestre la informaci�n de los 
		//aviones del tipo que nos indique el usuario

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el tipo de avion a buscar");
		String tipo = sc.nextLine();
		sc.close();

		try {
			Connection con;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vuelos", "root", "");

			PreparedStatement ps = con.prepareStatement("SELECT * FROM avion WHERE idtipo = ?");
			ps.setString(1, tipo);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
