package com.johannpando.certificacion.scjp6.whizlabs.ooConceptsTest.casteo;

interface Inter {

}

/**
 * 
 * @author jpandode
 * 
 */
class Base implements Inter {

	public void nada() {

	}
}

/**
 * Derived es un(a) Base. Derived is a Base
 * 
 * @author jpandode
 * 
 */
class Derived extends Base {

}

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Base b = new Base();
		// Puedo hacer lo siguiente...
		b.nada();
		Derived d = new Derived();
		// El casteo es innecesario, ya que el objeto 'b' implementa a Inter
		Inter i = (Base) b;
		// A pesar de que el objeto i ha sido casteado a Base, no puede hacer
		// uso, por ejemplo, del m�todo nada()
		// i.nada(); - Error de compilaci�n.

		// El casteo es correcto, d se puede convertir en Base. El casteo es
		// innecesario, ya que el objeto d (Derived) hereda a Base y el objeto i
		// ha sido casteado a Base.
		i = (Base) d;
		// No puedo castear de Base (b) a Derived, Base tiene mayor nivel que
		// Derived, se est� intentando pasar Base a Derived y no es posible. La
		// m�quina virtual la ignora porque 'entiende' que el programador est�
		// haciendo lo correcto.
		Derived bd = (Derived) b;
		// No ocurre ning�n problema, ya que el objeto i ha sido casteado a Base
		// y se est� asignado a otro objeto (b) tambi�n de tipo Base. El casteo
		// es necesario porque a pesar de que el objeto 'i' ha sido casteado
		// sigue siendo un objeto de la Interfaz Inter.
		b = (Base) i;
	}
}
