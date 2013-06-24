package com.johannpando.certificacion.scjp6.whizlabs.TestIII.Switch;

class MyException extends Exception {
}

public class Exception1 {

	void f() throws MyException {
		throw new MyException();
	}

	/**
	 * @param args
	 * @throws MyException
	 */
	public static void main(String[] args) throws MyException {
		MyException e1 = null;
		Exception1 t = new Exception1();
		try {
			t.f();
		} catch (MyException e) {
			e1 = e;
			System.out.println("catch");
		} finally {
			System.out.println("finally");
			throw e1;
		}
		// System.out.println("End");Al haber un throw en el finally, ésta línea
		// no se puede leer.
	}

}
