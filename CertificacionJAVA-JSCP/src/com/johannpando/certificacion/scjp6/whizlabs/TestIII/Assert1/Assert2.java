package com.johannpando.certificacion.scjp6.whizlabs.TestIII.Assert1;

/**
 * <p>
 * Pregunta
 * </p>
 * <p>
 * What will happen when you attempt to run the following code from the command
 * line using command - java Assert2?
 * </p>
 * <br>
 * <p>
 * Respuesta:
 * </p>
 * <p>
 * The code will compile and run without any error and it will print -
 * Assertions are disabled. Note that this code is run without enabling the
 * assertions. The command - java Assert2 does not use any command line switch
 * to enable the assertions in the class AssertDemo. However, as stated in the
 * question, the code is compiled with assertions enabled.
 * 
 * There is nothing wrong with line 7, and it will compile without any error.
 * The expression assertEnabled = true; is indeed a boolean expression that
 * yields true. The single "=" operator performs an assignment rather than a
 * comparison. In this particular case, this side effect is desired. Otherwise,
 * an assert statement should have no side effects, and should not alter the
 * state of the object.
 * 
 * The statement at line 5 assigns false to a variable assertEnabled. Since the
 * program is run without enabling the assertions, the statement at line 7 is
 * not executed, and hence the value of assertEnabled remains false. So print
 * statement at line 9-10 prints - Assertions are disabled.
 * 
 * If the same code is run from command line with command - java -ea AssertDemo,
 * it will enable the assertions and will print - Assertions are enabled. But
 * with the given statement, only choice C is correct.
 * </p>
 * 
 * @author Johann
 * 
 */
public class Assert2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		boolean assertEnabled = false;

		assert assertEnabled = true;

		System.out.println("Assertions are: "
				+ (assertEnabled ? "Enabled" : "Disabled"));
	}

}
