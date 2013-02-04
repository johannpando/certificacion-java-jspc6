package com.johannpando.certificacion.scjp6.dia.clasesAnonimas;

/**
 * * En el libro dice que se deducen dos cosas, en una de ellas no estoy de
 * acuerdo. <br>
 * Dice textualmente:
 * "La variable operaciones contiene una instancia del objeto de la clase an�nima, no de la clase Operaciones"
 * <br>
 * <br>
 * Bien, pues la verdad que en la clase an�nima se est� sobrescribiendo el
 * m�todo imprimir, por ello imprime an�nimo, si comentamos este m�todo, va
 * directamente al original, imprimiendo original, adem�s si la clase
 * Operaciones tuviese m�s m�todos podr�amos acceder a ellas.
 * 
 * @author jpandode
 * 
 */
class Externa {

	// Operaciones operaciones = new Operaciones() {
	// // Definici�n de la clase an�nima
	// public void imprimir() {
	// System.out.println("Imprimir an�nimo");
	// // propio();
	// }
	//
	// public void propio() {
	//
	// }
	// };

	Operaciones operaciones = new Operaciones() {

		public void imprimir() {
			System.out.println("Imprime an�nimo");
		}

		@Override
		public void implementar() {
			// TODO Auto-generated method stub

		}

		public void propio() {

		}
	};

	void proceso() {
		// Llamada al m�todo imprimir del objeto de la clase an�nima
		operaciones.imprimir();
		// Como se estudi� en la secci�n oop, una instancia de la clase anonima
		// solamente podr� ser utilizada para acceder a aquellos m�todos de la
		// clase que se hayan heredado, sobreescrito o implementado
		// operaciones.propio;//Esta sentencia da un error de compilaci�n

		// Comprobaci�n de que la variable operaciones de instacia de clase
		// an�nima no accede �nicamente a �sta clase sino tambi�n a la clase
		// Operaciones.
		operaciones.otroMetodo();

		// No puedo instanciar una clase abstracta?? creo que no. Efectiavamente
		// NO.
		// Operaciones o = new Operaciones();

		// Error de compilaci�n: S�lo podr� utilizar para acceder a aquellos
		// m�todos de la clase que se hayan heredado, sobrescrito o
		// implementado.
		// operaciones.propio();
	}

	/**
	 * Tambi�n se puede definir una clase an�nima a partir de una interfaz.
	 */
	void runnable() {
		Runnable rn = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

			}
		};
	}
}
