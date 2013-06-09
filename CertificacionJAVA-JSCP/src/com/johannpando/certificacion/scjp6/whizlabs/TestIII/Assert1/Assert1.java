package com.johannpando.certificacion.scjp6.whizlabs.TestIII.Assert1;

/**
 * The code will print - i = 20. It is important to understand when the assert
 * statement gets executed. Note that this code is run without enabling the
 * assertions. The command - java AssertTest does not use any command line
 * switch to enable the assertions in the AssertTest class.
 * 
 * At line 3, a static int i is assigned the value 10. When the main method
 * starts executing, at line 6 the value of i becomes 20. Next, since assertions
 * are NOT enabled while running the program, the statement at line 9 is not
 * executed. Hence, the isValid() method is not invoked in this execution.
 * 
 * Nota: Para habilitar una aserción, hacer clic en run configuration y en
 * argumentos de la jvm -ea
 * 
 * @author Johann
 * 
 */
public class Assert1 {

	static int i = 10;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		i = i * 2;

		try {
			assert isValid() : i = i / 4;
		} catch (AssertionError ignore) {

		}
		System.out.println("i = " + i);
	}

	public static boolean isValid() {
		i = i * 2;
		return false;
	}
}
