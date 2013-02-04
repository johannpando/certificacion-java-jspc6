package com.johannpando.certificacion.scjp6.libro.capitulo6.accesoAlDisco;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class LecturaDatosPrimitivosDesdeFichero {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		DataInputStream dis = new DataInputStream(new FileInputStream(
				"datos.mbd"));
		try {
			// Bucle infinito
			for (;;) {
				// El m�todo readInt() devuelve el entero actual y tras la
				// lectura de �ste se posiciona en el siguiente dato entero del
				// fichero. Cuando se llegue al final del fichero se producir�
				// una excepci�n EOFException al invocar al m�todo readInt(),
				// produci�ndose una salida del bucle infinito y finalizando la
				// aplicaci�n.
				System.out.println(dis.readInt());
			}
		} catch (EOFException e) {
			// e.printStackTrace();
		}
	}
}
