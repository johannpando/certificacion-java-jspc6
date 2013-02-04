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
		// Error de compilación: The method aMethod(int) from the type Base is
		// not visible
		// o.aMethod(iBase);

	}

	/**
	 * Está claro que no hace falta instanciar la superclase para acceder a
	 * métodos públicos debido que, y gracias a la herencia, puedo llamar a los
	 * métodos a través de la palabra reservada super. <br>
	 * Sólo se usa para estos ejercicios.
	 */
	public void llamandoAMetodos() {
		this.duda();// Llamando al método sobrescrito
		super.duda();// Llamando al método original
	}

	public void aMethod(int iOver) {
		System.out.println("Over");
	}

	public void duda() {

	}
}
