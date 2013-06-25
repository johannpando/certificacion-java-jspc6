package com.johannpando.certificacion.scjp6.whizlabs.TestII.sobreescrituraException;

public class AssertTestException {
	public void methodA(int i) throws AssertionError {
		assert i < 1024 : "Invalid Value";
	}
}

class Prueba extends AssertTestException {

	public void methodA(int i) {

	}
}

class LanzaError extends AssertTestException {
	public void methodA(int i) throws Error {

	}
}

class LanzaRuntime extends AssertTestException {
	public void methodA(int i) throws RuntimeException {

	}
}

class LanzaException extends AssertTestException {
	// Exception is not compatible with throws clause in
	// AssertTestException.methodA(int)
	// public void methodA(int i) throws Exception {
	//
	// }
}

class LanzaThrowable extends AssertTestException {
	// Exception is not compatible with throws clause in
	// AssertTestException.methodA(int)
	// public void methodA(int i) throws Throwable {
	//
	// }
}