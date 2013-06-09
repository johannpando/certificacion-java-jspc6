package com.johannpando.certificacion.scjp6.whizlabs.TestIII.ABC;

/**
 * The code does not compile because the && operator works only with boolean
 * operands. If both operands are true, the && operator returns true and false
 * in all the other cases. In this case, integer operands are passed to the &&
 * operator, so the code does not compile. Since the code does not compile,
 * choices A to D are incorrect.
 * 
 * Choice E is incorrect because there is nothing wrong with the declaration of
 * the main method. The modifiers public and static can appear in any order.
 * Also, the main method takes a String[] as the argument.
 * 
 * @author Johann
 * 
 */
public class Main {

	private void test() {
		// System.out.println(6 && 7);
	}

	/**
	 * @param args
	 */
	static public void main(String[] juanito) {
		new Main().test();
	}

}
