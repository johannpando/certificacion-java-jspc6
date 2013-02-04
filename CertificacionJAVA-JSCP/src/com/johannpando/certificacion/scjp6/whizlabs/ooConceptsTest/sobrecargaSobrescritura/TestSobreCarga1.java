package com.johannpando.certificacion.scjp6.whizlabs.ooConceptsTest.sobrecargaSobrescritura;

/**
 * El método f está sobrecargado correctamente, ya que los argumentos cambian en
 * cada versión.
 * 
 * @author jpandode
 * 
 */
public class TestSobreCarga1 {

	static Object test = "Hello";

	void f(Object x) {
		System.out.println("Object");
	}

	void f(String x) {
		System.out.println("String");
	}

	void f(StringBuffer x) {
		System.out.println("StringBuffer");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestSobreCarga1 t = new TestSobreCarga1();
		// Here even though the actual object passed is String type, the object
		// reference is of Object type.
		// Aquí aunque el objeto real pasado es de tipo String, el objeto de
		// referencia es de tipo Object.
		t.f(test);
	}

}
