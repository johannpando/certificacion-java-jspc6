package com.johannpando.certificacion.scjp6.libro.capitulo6.accesoAlDisco;

import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		new IOStream1().main(args);
	}
}

class IOStream1 {
	public void main(String args[]) {

		try {
			java.io.BufferedWriter out = new java.io.BufferedWriter(
					new FileWriter("abc.txt", true));
			// out.write("otrogato1");
			out.append("otrogato2");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
