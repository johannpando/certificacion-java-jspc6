package com.johannpando.certificacion.scjp6.dia.clasesAnonimas;

abstract class Operaciones {

	/**
	 * Una clase abstracta no se puede instanciar al tener métodos sin
	 */
	public Operaciones() {

	}

	public void imprimir() {
		System.out.println("Imprimir original");
	}

	public void otroMetodo() {
		System.out.println("Otro Métodos");
	}

	public abstract void implementar();

}
