package com.johannpando.certificacion.scjp6.libro.capitulo7.conexionBD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BuscarLibros {

	private static Connection conexion;
	private static Statement st;

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		String rpta = null, isbn, sql;
		conectarBaseDatos();

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// rpta = bf.readLine();

		do {
			System.out.println("Ingresar el ISBN del libro a buscar:");
			isbn = bf.readLine();

			sql = "select * from libros l ";
			sql += "where l.ISBN = " + "'" + isbn + "'";

			try {
				ResultSet rs = st.executeQuery(sql);

				if (rs.next()) {
					System.out.println("Mostrando datos del libro...");
					System.out.println("Título :" + rs.getString("titulo"));
					System.out.println("Autor :" + rs.getString("autor"));
					System.out.println("Precio :" + rs.getString("precio"));
				} else {
					System.out.println("No se ha encontrado el libro...");
				}

				System.out.println("¿Desea realizar una nueva búsqueda (s/n)?");
				rpta = bf.readLine();

			} catch (SQLException e) {
				desconectarBaseDatos();
				rpta = "n";
				e.printStackTrace();
			}

		} while (!rpta.equals("n"));

		desconectarBaseDatos();
	}

	private static void conectarBaseDatos() {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			conexion = DriverManager.getConnection(
					"jdbc:mysql://localhost/esquema_prueba", "root", "root");

			st = conexion.createStatement();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void desconectarBaseDatos() {
		try {
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
