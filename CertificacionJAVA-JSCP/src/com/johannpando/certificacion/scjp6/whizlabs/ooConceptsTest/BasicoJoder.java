package com.johannpando.certificacion.scjp6.whizlabs.ooConceptsTest;

class SuperClase {
	public void imprime() {
		System.out.println("superclase");
	}
}

public class BasicoJoder extends SuperClase {

	public void imprime() {
		System.out.println("subclase");
	}

	public static void main(String[] args) {
		SuperClase s = new BasicoJoder();
		s.imprime();
	}

}
