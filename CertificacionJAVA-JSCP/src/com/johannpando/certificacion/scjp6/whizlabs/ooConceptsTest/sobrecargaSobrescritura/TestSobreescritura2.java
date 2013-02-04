package com.johannpando.certificacion.scjp6.whizlabs.ooConceptsTest.sobrecargaSobrescritura;

class SuperTest {

	int f() {
		return 0;
	}
}

/**
 * El hecho de que exista un constructor con par�metros no implica que tengamos
 * que indicar expl�citamente el constructor por defecto, siempre que no se
 * intente crear un objeto de la clase sin par�metros, ejem:<br>
 * <br>
 * Test test = new Test();
 * 
 * @author jpandode
 * 
 */
public class TestSobreescritura2 extends SuperTest {

	int i;

	/**
	 * protected no es menos restrictivo que el acceso por defecto, por lo que
	 * se puede sobrescribir un m�todo default y ser protected.<br>
	 * <br>
	 * Error and RuntimeException are unchecked exception, so they can be thrown
	 * in the overriding subclass method even in the overridden method does not
	 * throw them.<br>
	 * <br>
	 * Error y RuntimeException excepci�n se controla, para que puedan ser
	 * lanzados en el m�todo de la subclase sobrescrita, incluso en el m�todo
	 * sobreescrito no lanzarlos.
	 */
	protected int f() throws Error {
		return i;
	}

	TestSobreescritura2(int i) {
		this.i = i;
	}

	public static void main(String[] args) {

		SuperTest t = new TestSobreescritura2(5);
		// La variable t es de tipo Test, pero en tiempo de ejecuci�n llama al
		// m�todo definido en la subclase.
		System.out.println(t.f());

		// Error de compilaci�n: The constructor Test() is undefined
		// Test test = new Test();

	}

}
