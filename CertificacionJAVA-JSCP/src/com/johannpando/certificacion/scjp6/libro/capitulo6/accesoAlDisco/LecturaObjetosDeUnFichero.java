package com.johannpando.certificacion.scjp6.libro.capitulo6.accesoAlDisco;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LecturaObjetosDeUnFichero {

	/**
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws IOException,
			ClassNotFoundException {

		FileInputStream fis = new FileInputStream("datos.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		// Se debe hacer un casting al tipo original
		EscrituraObjetosEnUnFicheroPersona p = (EscrituraObjetosEnUnFicheroPersona) ois
				.readObject();
		System.out.println(p.getName());
		System.out.println(p.getEdad());
		ois.close();
	}

}
