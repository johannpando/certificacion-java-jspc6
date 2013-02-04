package com.johannpando.certificacion.scjp6.whizlabs.ooConceptsTest.casteo;

interface Inter {

}

/**
 * 
 * @author jpandode
 * 
 */
class Base implements Inter {

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
		Derived d = new Derived();
		Inter i = (Base) b;
		i = (Base) d;
		Derived bd = (Derived) b;
		b = (Base) i;
	}
}
