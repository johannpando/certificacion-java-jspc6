package com.johannpando.certificacion.scjp6.libro.capitulo6.accesoAlDisco;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CreacionObjetoObjectOutputStream {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("datos.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(new EscrituraObjetosEnUnFicheroPersona("johann", 32));
		oos.close();// cierra el stream
	}

}
