package com.johannpando.certificacion.scjp6.libro.capitulo6.accesoAlDisco;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscrituraDatosPrimitivosJavaEnUnFichero_GrabaArray {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// Si el segundo parámetro es true, añade información de lo contrario lo
		// sobrescribe.
		FileOutputStream fos = new FileOutputStream("datos.mbd", false);
		DataOutputStream dos = new DataOutputStream(fos);
		// array de enteros
		int[] a = { 1, 3, 7, 2 };
		for (int i = 0; i < a.length; i++) {
			dos.writeInt(a[i]);
		}
		// cierra el stream
		dos.close();
	}

}
