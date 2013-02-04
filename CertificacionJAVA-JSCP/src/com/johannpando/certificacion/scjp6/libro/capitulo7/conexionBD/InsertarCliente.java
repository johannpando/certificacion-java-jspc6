package com.johannpando.certificacion.scjp6.libro.capitulo7.conexionBD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertarCliente {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String pwd, usr, dir, tel;

		try {

			System.out.println("Ingrese el password de usuario:");
			pwd = bf.readLine();

			System.out.println("Ingrese el nombre de usuario:");
			usr = bf.readLine();

			System.out.println("Ingrese la dirección del usuario");
			dir = bf.readLine();

			System.out.println("Ingrese el teléfono del usuario");
			tel = bf.readLine();

			Class.forName("com.mysql.jdbc.Driver");

			Connection conexion = DriverManager.getConnection(
					"jdbc:mysql://localhost/esquema_prueba", "root", "root");

			Statement st = conexion.createStatement();

			String sql = "insert into clientes values (null,'";
			sql += pwd + "', '" + usr + "', '" + dir + "', '" + tel + "')";

			st.execute(sql);
			conexion.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
