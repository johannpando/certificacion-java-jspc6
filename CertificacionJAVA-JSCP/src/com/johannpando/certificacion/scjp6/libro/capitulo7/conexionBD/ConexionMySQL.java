package com.johannpando.certificacion.scjp6.libro.capitulo7.conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionMySQL {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void main(String[] args) {

		try {
			// 1.- CONEXIÓN A BASE DE DATOS
			// 1.1.- Cargar el drive.- Se prepara el driver JDBC para que pueda
			// ser utilizado. Localiza, lee y enlaza dinamicamente el driver,
			// devolviendo un objeto Class asociado a la clase indicada, puede
			// provocar una excepción de tipo ClassNotFoundException.
			Class.forName("com.mysql.jdbc.Driver");
			// 1.2.- Creación de la conexión.- Una vez cargado el driver se debe
			// proceder a la conexión con la base de datos, operación que se
			// lleva a cabo con el método estático getConnection(), de la clase
			// DriverManager el API JDBC. Puede provocar SQLException.
			Connection conexion = DriverManager.getConnection(
					"jdbc:mysql://localhost/esquema_prueba", "root", "root");
			// 2.- CREACIÓN DEL OBJETO STATEMENT.- Devuelve un objeto Statement
			// y puede provocar una SQLException.
			Statement st = conexion.createStatement();
			// 3.- EJECUCIÓN DE LA CONSULTA.-
			ResultSet rs = st.executeQuery("select * from tabla_prueba");
			while (rs.next()) {
				System.out.println(rs.getString("des_prueba"));
			}
			// 4.- CIERRE DE LA CONEXIÓN.- Puede provocar una SQLException.
			conexion.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("estado: " + e.getSQLState());
			System.out.println("código de error " + e.getErrorCode());
		}

	}

}
