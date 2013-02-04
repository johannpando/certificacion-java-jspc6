package com.johannpando.certificacion.scjp6.whizlabs.ooConceptsTest.relationships;

public class Relationships {

}

/**
 * Foo '<strong>has a</strong>' Bar"<br>
 * Foo '<strong>tiene un</strong>' Bar"<br>
 * <br>
 * 
 * @author jpandode
 * 
 */
class Foo {
	int num;
	Baz comp = new Baz();
}

class Bar {
	boolean flag;
}

/**
 * "Bazz '<strong>is a</strong>' Baz" <br>
 * "Bazz '<strong>es un</strong>' Foo" <br>
 * <br>
 * "Baz '<strong>has a</strong>' Bar"<br>
 * "Baz '<strong>tiene un</strong>' Bar"<br>
 * <br>
 * 
 * @author jpandode
 * 
 */
class Baz extends Foo {
	Bar thing = new Bar();
	double limit;
}
