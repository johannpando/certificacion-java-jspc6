package com.johannpando.certificacion.scjp6.libro.capitulo7.conexionBD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BuscarClientes {

	static Connection conexion;
	static PreparedStatement ps;
	static Statement st;

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 * @throws SQLException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException, SQLException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String usuario, password, sql;

		conectarBaseDatos();

		int op;

		do {
			System.out.println("1.- Buscar cliente");
			System.out.println("2.- Salir");
			op = Integer.parseInt(bf.readLine());
			if (op == 1) {
				System.out.println("Ingrese su usuario:");
				usuario = bf.readLine();
				System.out.println("Ingrese su password:");
				password = bf.readLine();

				sql = "select * from clientes c ";
				sql += "where c.usuario = " + "'" + usuario + "'";
				sql += " and c.password = " + "'" + password + "'";

				// System.out.println(sql);

				try {
					ResultSet rs = st.executeQuery(sql);

					if (rs.next()) {
						System.out.println("Usuario válido");
					} else {
						System.out.println("Usuario no válido");
					}

				} catch (SQLException e) {
					conexion.close();
					op = 2;
					e.printStackTrace();

				}
			}
		} while (op != 2);
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

}
