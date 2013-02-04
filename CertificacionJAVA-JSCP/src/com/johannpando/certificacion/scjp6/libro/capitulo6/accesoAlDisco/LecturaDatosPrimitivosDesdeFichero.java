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
				// El método readInt() devuelve el entero actual y tras la
				// lectura de éste se posiciona en el siguiente dato entero del
				// fichero. Cuando se llegue al final del fichero se producirá
				// una excepción EOFException al invocar al método readInt(),
				// produciéndose una salida del bucle infinito y finalizando la
				// aplicación.
				System.out.println(dis.readInt());
			}
		} catch (EOFException e) {
			// e.printStackTrace();
		}
	}
}
