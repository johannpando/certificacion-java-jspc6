package com.johannpando.certificacion.scjp6.libro.capitulo6.practicas6_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;

public class Agenda {

	private final String path = "c:\\agenda.obj";
	private Hashtable<String, Persona> tp;

	public Agenda() throws IOException, ClassNotFoundException {
		// Recuperaci�n de los datos de la agenda cuando comienza la ejecuci�n
		// de la aplicaci�n.
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(path);
			ois = new ObjectInputStream(fis);
			tp = (Hashtable<String, Persona>) ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			tp = new Hashtable<String, Persona>();
		}
	}

	/**
	 * M�todo encargado de a�adir a la hashTable tp, el nombre, el dni y el
	 * tel�fono a una nueva persona
	 * 
	 * @param nom
	 * @param dni
	 * @param tel
	 * @return
	 */
	public boolean agregar(String nom, String dni, String tel) {

		// Buscamos en el hashtable si no existe una llave (dni) para insertar a
		// la persona
		if (!tp.containsKey(dni)) {
			Persona p = new Persona(nom, dni, tel);
			tp.put(dni, p);
			return true;
		} else {// de lo contrario devolvemos que la operaci�n ha fallado,
				// return false.
			return false;
		}
	}

	/**
	 * M�todo encargado de eliminar del hashTable tp por la llave indicada, dni.
	 * 
	 * @param dni
	 * @return operacionCorrecta variable booleana, por defecto false
	 */
	public boolean eliminar(String dni) {

		boolean operacionCorrecta = false;

		// Si la clave se encuentra, se elimina a la persona
		if (tp.containsKey(dni)) {
			tp.remove(dni);
			operacionCorrecta = true;
		} else {// de lo contrario, la operaci�n no ha sido satisfactoria
			return operacionCorrecta;
		}

		return operacionCorrecta;
	}

	public Persona recuperar(String dni) {
		Persona p = null;

		if (tp.containsKey(dni)) {
			p = tp.get(dni);
		}

		return p;
	}

	/**
	 * M�todo que devuelve todas las llaves del hashTable <code>tp</code>
	 * 
	 * @return tp.keys();
	 */
	public Enumeration<String> total() {
		return tp.keys();
	}

	/**
	 * M�todo a�adido que guarda la hashtable de Personas en un fichero.
	 * 
	 * @throws IOException
	 */
	public void guardar() throws IOException {
		// Guarda la tabla en disco
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(tp);
		oos.close();
	}

}
