package com.johannpando.certificacion.scjp6.libro.capitulo4.practicas4_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class LecturaNumeros extends BufferedReader {

	// **************CONSUTRUCTORES **************

	/**
	 * Prepara al objeto para realizar la lectura de datos por el teclado
	 */
	LecturaNumeros() {
		super(new InputStreamReader(System.in));
	}

	/**
	 * Realiza la lectura desde el objeto Reader especificado como par�metro
	 * 
	 * @param r
	 */
	LecturaNumeros(Reader r) {
		super(r);
	}

	// **************M�TODOS**********************

	/**
	 * Devolver� el dato num�rico correspondiente a la �ltima l�nea de
	 * caracteres suministrada.
	 * 
	 * @return int
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	int readInt() throws NumberFormatException, IOException {
		return Integer.parseInt(this.readLine());
	}

	/**
	 * Devolver� el dato num�rico correspondiente a la �ltima l�nea de
	 * caracteres suministrada, as� como el mensaje indicado
	 * 
	 * @param mensaje
	 * @return int
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	int readInt(String mensaje) throws NumberFormatException, IOException {
		System.out.println(mensaje);
		return Integer.parseInt(this.readLine());
	}

	/**
	 * Devolver� el dato num�rico correspondiente a la �ltima l�nea de
	 * caracteres suminstrada
	 * 
	 * @return Integer
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	Integer readInteger() throws NumberFormatException, IOException {
		return new Integer(this.readLine());
	}

	/**
	 * Devolver� el dato num�rico le�do, como un tipo double.
	 * 
	 * @return double
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	double readDouble() throws NumberFormatException, IOException {
		return Double.parseDouble(this.readLine());
	}

	/**
	 * Devolver� el dato num�rico le�do, como un tipo double, as� como el
	 * mensaje indicado
	 * 
	 * @param mensaje
	 * @return
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	double readDouble(String mensaje) throws NumberFormatException, IOException {
		System.out.println(mensaje);
		return Double.parseDouble(this.readLine());
	}

}
