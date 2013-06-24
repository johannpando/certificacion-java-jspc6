package com.johannpando.certificacion.scjp6.whizlabs.Test1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter2 {
	public static void main(String args[]) {
		new BufferedWriter2().new IOStream1().main(args);
	}

	class IOStream1 {

		public void main(String[] args) {
			try {
				// Error de compilación:
				// The constructor BufferedWriter(String, boolean) is undefined
				// FileWriter out = new FileWriter(new BufferedWriter("",
				// true));

				// Correcto pero no añade porque es false...
				// Una invocación de este método de la forma out.append (csq) se
				// comporta exactamente de la misma manera que la invocación
				// out.write (csq.toString ())
				BufferedWriter out = new BufferedWriter(new FileWriter(
						"abc.txt", false));
				out.append("world");
				// #1
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}