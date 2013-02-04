package com.johannpando.certificacion.scjp6.dia.clasesAnonimas;

/**
 * * En el libro dice que se deducen dos cosas, en una de ellas no estoy de
 * acuerdo. <br>
 * Dice textualmente:
 * "La variable operaciones contiene una instancia del objeto de la clase anónima, no de la clase Operaciones"
 * <br>
 * <br>
 * Bien, pues la verdad que en la clase anónima se está sobrescribiendo el
 * método imprimir, por ello imprime anónimo, si comentamos este método, va
 * directamente al original, imprimiendo original, además si la clase
 * Operaciones tuviese más métodos podríamos acceder a ellas.
 * 
 * @author jpandode
 * 
 */
class Externa {

	// Operaciones operaciones = new Operaciones() {
	// // Definición de la clase anónima
	// public void imprimir() {
	// System.out.println("Imprimir anónimo");
	// // propio();
	// }
	//
	// public void propio() {
	//
	// }
	// };

	Operaciones operaciones = new Operaciones() {

		public void imprimir() {
			System.out.println("Imprime anónimo");
		}

		@Override
		public void implementar() {
			// TODO Auto-generated method stub

		}

		public void propio() {

		}
	};

	void proceso() {
		// Llamada al método imprimir del objeto de la clase anónima
		operaciones.imprimir();
		// Como se estudió en la sección oop, una instancia de la clase anonima
		// solamente podrá ser utilizada para acceder a aquellos métodos de la
		// clase que se hayan heredado, sobreescrito o implementado
		// operaciones.propio;//Esta sentencia da un error de compilación

		// Comprobación de que la variable operaciones de instacia de clase
		// anónima no accede únicamente a ésta clase sino también a la clase
		// Operaciones.
		operaciones.otroMetodo();

		// No puedo instanciar una clase abstracta?? creo que no. Efectiavamente
		// NO.
		// Operaciones o = new Operaciones();

		// Error de compilación: Sólo podrá utilizar para acceder a aquellos
		// métodos de la clase que se hayan heredado, sobrescrito o
		// implementado.
		// operaciones.propio();
	}

	/**
	 * También se puede definir una clase anónima a partir de una interfaz.
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
