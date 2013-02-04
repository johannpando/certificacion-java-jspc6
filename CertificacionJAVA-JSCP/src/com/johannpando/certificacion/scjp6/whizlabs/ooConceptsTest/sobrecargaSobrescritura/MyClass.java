package com.johannpando.certificacion.scjp6.whizlabs.ooConceptsTest.sobrecargaSobrescritura;

public class MyClass {

	public static void main(String[] args) {

	}

	void amethod(int i) {

	}

}

class MySubClass extends MyClass {

	/**
	 * Error al sobreescribir ya que no cumple con el criterio que todo debe ser
	 * igual que el método original, en este caso "throws Exception". Pero
	 * además no se permite lanzar excepciones controladas.
	 * 
	 * <br>
	 * <br>
	 * La opción A no es una forma válida para sobre escribir, ya que lanza
	 * excepciones en que no producida por el método original de la clase
	 * MyClass.
	 */
	// protected void amethod(int i) throws Exception {
	//
	// }

	/**
	 * <li>No puede ser sobreescritura, porque el tipo de retorno cambia del
	 * original que es void.</li>
	 * 
	 * <li>No puede ser sobrecarga porque no se distingue ni el número ni tipo
	 * de argumento.</li><br>
	 * <br>
	 */
	// public int amethod(int i) {
	// return 0;
	// }

	/**
	 * Estamos ante un ejemplo de sobrecarga porque ha cambiado el tipo de
	 * argumento, da igual el tipo de retorno.
	 * 
	 * @param i
	 * @return
	 */
	int amethod(float i) {
		return 0;
	}

	/**
	 * En la sobreescritura está permitido las excepciones de tipo unchecked. <br>
	 * <br>
	 * 
	 * Opción C es una forma válida para sobre escribir el "aMethod" método, ya
	 * que el tipo de retorno y coincidencia argumentos. Modificador de acceso
	 * se permite que sea la misma o del público en mayor imperiosas, de modo
	 * que no es también un problema. A pesar de que no se le permite lanzar
	 * nuevos expections controladas, lanzar excepciones sin control no es un
	 * problema en sobre escritura. Por lo tanto, C es la correcta.
	 * 
	 */
	void amethod(int i) throws NumberFormatException {

	}

}