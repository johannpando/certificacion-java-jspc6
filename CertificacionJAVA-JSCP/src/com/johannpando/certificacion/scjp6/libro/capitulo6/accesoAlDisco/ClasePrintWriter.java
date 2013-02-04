package com.johannpando.certificacion.scjp6.libro.capitulo6.accesoAlDisco;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ClasePrintWriter {

	/**
	 * El fichero
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		String[] nombres = { "ana", "rosa", "juan", "pepe" };
		FileWriter fw = new FileWriter("datos.txt");
		PrintWriter out = new PrintWriter(fw);
		for (String n : nombres) {
			out.println(n);
		}
		out.flush();
		out.close();
	}

}
