package com.johannpando.certificacion.scjp6.libro.capitulo5.excepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PropagandoExcepcion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			imprime(bf);
		} catch (IOException e) {
			System.out.println("Fallo de lectura");
		}
	}

	/**
	 * Se propaga la excepción con la palabra reservada <code>throws</code>.
	 * 
	 * @param bf
	 * @throws IOException
	 */
	static void imprime(BufferedReader bf) throws IOException {
		String s = bf.readLine();
		System.out.println(s);
	}

}
