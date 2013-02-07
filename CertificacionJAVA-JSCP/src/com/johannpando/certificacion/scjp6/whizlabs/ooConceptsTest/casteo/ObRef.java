package com.johannpando.certificacion.scjp6.whizlabs.ooConceptsTest.casteo;

interface IFace {
}

class CFace implements IFace {
}

class Base1 {
}

class DFace extends CFace {
}

public class ObRef extends Base1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ObRef ob = new ObRef();
		Base1 b = new Base1();
		Object o1 = new Object();
		IFace i2 = new CFace();
		o1 = new ObRef();// ***

		// *** Si no existiese esta línea

		// *** Un claro ejemplo de error de ejecución y no de compilación.
		// o1 es un objeto de tipo Object al cual se le intenta castear a Base1
		// y que además se le asigna a una variable 'b' que es del mismo tipo a
		// castear, es como si dijera que la variable 'b' (Base1) va a recibir
		// (se le va a asignar) un objeto de tipo Base1.
		// No existe error de compilación porque la jvm lo da como válido.
		// Pero al ejecutar la clase, da un error de ejecución porque no puedo
		// castear un Object en Base1. Queda claro.
		// b = (Base1) o1;

		// *** Este es un error de compilación. Y es por la asignación NO por el
		// casteo.
		// Me explico, si ob fuera de tipo Base1, el compilador no se quejaría,
		// pero como no es del tipo al que se le intenta castear, es decir,
		// Base1, directamente da un error de compilación.
		// ob = (Base1) o1;

		ob = (ObRef) o1;
		o1 = i2;
		b = ob;
		o1 = b;

	}

}
