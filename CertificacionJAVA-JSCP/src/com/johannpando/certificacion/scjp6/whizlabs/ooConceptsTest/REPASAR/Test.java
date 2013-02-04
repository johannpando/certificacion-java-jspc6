package com.johannpando.certificacion.scjp6.whizlabs.ooConceptsTest.REPASAR;

class SuperBase {

}

class Base extends SuperBase {

}

class Derived extends Base {

}

public class Test {

	/**
	 * Este es un asunto dif�cil, aqu� el problema es con la sintaxis de
	 * creaci�n de matriz.<br>
	 * <br>
	 * 
	 * Cuando se utiliza esta sintaxis para crear matrices, no debemos
	 * especificar el tama�o, el tama�o se eval�a a partir del n�mero de
	 * elementos entre las llaves. Aqu�, la declaraci�n debe ser cambiado a
	 * "new Derived [] {new Derived ()}".<br>
	 * <br>
	 * 
	 * Aparte de esto no hay errores en este programa. Una amplia clase derivada
	 * puede ser asignado a ser una matriz de clase base. As� que todos los
	 * dem�s assigments son v�lidos. Es legal hacer una matriz de tama�o 0
	 * tambi�n.<br>
	 * <br>
	 * 
	 * This is a tricky, here the problem is with the array creation syntax.
	 * 
	 * When we use this syntax to create arrays, we should not specify the size,
	 * the size is evaluated from the number of elements between the curly
	 * braces. Here the declaration should be changed to
	 * "new Derived[]{new Derived()}".
	 * 
	 * Other than this there are no errors in this program. A derived class
	 * array can be assigned to be a base class array. So all the other
	 * assigments are valid. It is legal to make an array of size 0 also.
	 */
	public static void main(String[] args) {
		// isEmpty();

		// Correcto: Se puede asignar a una instancia de superclase un objeto de
		// subclase.
		SuperBase[] s1 = new Base[2];

		// Error de compilaci�n: Explicaci�n en el javadoc del m�todo main.
		// SuperBase[] s2 = new Derived[1] { new Derived() };
		// Soluci�n
		SuperBase[] s2 = new Derived[] { new Derived() };

		// Correcto: Se puede asignar a una instancia de superclase un objeto de
		// subclase.
		Base[] b1 = new Derived[0];
		// Correcto:
		// El objeto d1 es subclase de Base y de SuperBase.
		// El objeto s2 es un objeto de tipo SuperBase al que se le ha asignado
		// un objeto de tipo Derived, por lo que si no realiza el casteo, dar�
		// un error de compilaci�n ya que no podr�a convertir SuperBase a
		// Derived
		Derived[] d1 = (Derived[]) s2;
		Base[] b3 = d1;
		s1 = b1;
	}
	// public static void isEmpty() {
	// String cadena = "   ";
	//
	// if (cadena.isEmpty()) {
	// System.out.println("1");
	// } else {
	// System.out.println("2");
	// }
	// }

}
