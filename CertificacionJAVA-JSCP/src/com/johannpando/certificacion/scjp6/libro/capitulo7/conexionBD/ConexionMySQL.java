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
			// 1.- CONEXI�N A BASE DE DATOS
			// 1.1.- Cargar el drive.- Se prepara el driver JDBC para que pueda
			// ser utilizado. Localiza, lee y enlaza dinamicamente el driver,
			// devolviendo un objeto Class asociado a la clase indicada, puede
			// provocar una excepci�n de tipo ClassNotFoundException.
			Class.forName("com.mysql.jdbc.Driver");
			// 1.2.- Creaci�n de la conexi�n.- Una vez cargado el driver se debe
			// proceder a la conexi�n con la base de datos, operaci�n que se
			// lleva a cabo con el m�todo est�tico getConnection(), de la clase
			// DriverManager el API JDBC. Puede provocar SQLException.
			Connection conexion = DriverManager.getConnection(
					"jdbc:mysql://localhost/esquema_prueba", "root", "root");
			// 2.- CREACI�N DEL OBJETO STATEMENT.- Devuelve un objeto Statement
			// y puede provocar una SQLException.
			Statement st = conexion.createStatement();
			// 3.- EJECUCI�N DE LA CONSULTA.-
			ResultSet rs = st.executeQuery("select * from tabla_prueba");
			while (rs.next()) {
				System.out.println(rs.getString("des_prueba"));
			}
			// 4.- CIERRE DE LA CONEXI�N.- Puede provocar una SQLException.
			conexion.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("estado: " + e.getSQLState());
			System.out.println("c�digo de error " + e.getErrorCode());
		}

	}

}
