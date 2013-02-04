package com.johannpando.certificacion.scjp6.whizlabs.ooConceptsTest.visibilidad;

class Base {
	private void aMethod(int Base) {
		System.out.println("Base");
	}

	public void duda() {

	}
}

public class Over extends Base {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Base o = new Over();
		int iBase = 0;
		// Error de compilaci�n: The method aMethod(int) from the type Base is
		// not visible
		// o.aMethod(iBase);

	}

	/**
	 * Est� claro que no hace falta instanciar la superclase para acceder a
	 * m�todos p�blicos debido que, y gracias a la herencia, puedo llamar a los
	 * m�todos a trav�s de la palabra reservada super. <br>
	 * S�lo se usa para estos ejercicios.
	 */
	public void llamandoAMetodos() {
		this.duda();// Llamando al m�todo sobrescrito
		super.duda();// Llamando al m�todo original
	}

	public void aMethod(int iOver) {
		System.out.println("Over");
	}

	public void duda() {

	}
}
