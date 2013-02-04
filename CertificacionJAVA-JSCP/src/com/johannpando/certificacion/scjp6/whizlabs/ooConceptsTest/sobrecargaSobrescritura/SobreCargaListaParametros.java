package com.johannpando.certificacion.scjp6.whizlabs.ooConceptsTest.sobrecargaSobrescritura;

public class SobreCargaListaParametros {

	public void aMethod(int i, String s) {

	}

	/**
	 * Método sobrecargado correctamente, ya que ha el tipo de argumento.
	 * 
	 * @param c
	 */
	public void aMethod(float c) {

	}

	/**
	 * Método sobrecargado porque ha cambiado la lista de argumentos,
	 * original(int, String) sobrecargado (String, int)
	 * 
	 * @param s
	 * @param i
	 */
	public void aMethod(String s, int i) {

	}

	/**
	 * La opción D es correcta, porque el nombre del método es diferente, por lo
	 * que es tratado como cualquier otro método en esa clase.<br>
	 * <br>
	 * Choice D Is correct because the method name is different, so it is
	 * treated as just another method in that class.<br>
	 * s
	 * 
	 * @param i
	 * @param s
	 */
	public void AMethod(int i, String s) {

	}

	/**
	 * Error de compilación, porque no cambia la lista de argumentos; recordar
	 * que da igual el tipo de retorno.
	 * 
	 * @param i
	 * @param s
	 * @return
	 */
	// public int aMethod(int i, String s) {
	//
	// }

}
