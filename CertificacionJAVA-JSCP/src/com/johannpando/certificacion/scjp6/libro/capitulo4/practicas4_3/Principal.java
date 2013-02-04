package com.johannpando.certificacion.scjp6.libro.capitulo4.practicas4_3;

import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {

		LecturaNumeros ln = new LecturaNumeros();
		int suma = 0;
		for (int i = 1; i < 5; i++) {
			suma += ln.readInt("Introduce número");
		}
		System.out.println("La suma es: " + suma);

		LecturaNumeros ln2 = new LecturaNumeros(
				new InputStreamReader(System.in));
		System.out.println("Di mi nombre:");
		System.out.println(ln2.readLine());
	}

}
