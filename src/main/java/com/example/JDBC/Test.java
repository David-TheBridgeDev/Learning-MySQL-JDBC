package com.example.JDBC;

import java.sql.*;

public class Test {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/empresa";

		Connection con;
		try {

			con = DriverManager.getConnection(url, "root", "");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT NOMBRED, NUMEROD FROM departamento");

			while (rs.next()) {
				String x = rs.getString(1);
				String s = rs.getString(2);
				System.out.println("  " + x + "  " + s);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
