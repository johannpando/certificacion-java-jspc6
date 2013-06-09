package com.johannpando.certificacion.scjp6.whizlabs.TestIII.PasoPorCopia;

class PassTest {
	int i = 3;
}

/**
 * When a method which takes an object argument is invoked, the method obtains a
 * copy of the object reference from the calling method. Both the original
 * reference variable and the copy refer to the same object in memory. So,
 * altering the object within the method affects the original object itself.
 * 
 * In the xx() method, setting i=10 using p, alters the object which is
 * referenced by both p and passTest variables. So 10 is output when the value
 * of i is printed. However, in the yy() method, the argument variable p is made
 * to refer to a new PassTest object.
 * 
 * This does not affect the reference variable passTest in the original method.
 * So passTest still refers to the object which has the value of i set to 10. So
 * the output is 10 again.
 * 
 * @author Johann
 * 
 */
public class PorCopia1 {
	public static void xx(PassTest p) {
		p.i = 10;
	}

	public static void yy(PassTest p) {
		p = new PassTest();
	}

	public static void main(String[] args) {
		PassTest passTest = new PassTest();
		xx(passTest);
		System.out.println(passTest.i);
		yy(passTest);
		System.out.println(passTest.i);

		Integer a = 3 ^ 2;
		System.out.println(a);
	}
}
