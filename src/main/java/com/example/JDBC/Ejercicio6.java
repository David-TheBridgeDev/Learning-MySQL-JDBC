package com.example.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Escribe un programa que borre los aviones para los que no exista  
		//ning�n planvuelo relacionado y que indique el n�mero de tuplas borradas. 

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
			//DA ERROR LA SENTANCIA SQL
			int rowsAffected = stmt.executeUpdate("DELETE FROM avion WHERE idavion IN (SELECT T1.idavion FROM avion T1 LEFT JOIN planvuelo T2 ON T1.idavion = T2.idavion WHERE T2.idavion IS NULL)");

			System.out.println("El numero de tuplas afectadas es: " + rowsAffected);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
