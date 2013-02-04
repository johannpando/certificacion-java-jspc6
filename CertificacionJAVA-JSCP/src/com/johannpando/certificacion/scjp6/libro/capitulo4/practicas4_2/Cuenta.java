package com.johannpando.certificacion.scjp6.libro.capitulo4.practicas4_2;

public class Cuenta {

	private float saldo;

	public Cuenta() {
		this.saldo = 0;
	}

	public Cuenta(float saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método que permite ingresar a la cuenta (En un principio el método tenía
	 * el modificador default)
	 * 
	 * @param c
	 */
	public void ingresar(float c) {
		this.saldo += c;
	}

	/**
	 * Método que permite extraer de la cuenta
	 * 
	 * (En un principio el método tenía el modificador default)
	 * 
	 * @param c
	 */
	public void extraer(float c) {
		this.saldo -= c;
	}

	/**
	 * @param saldo
	 *            the saldo to set
	 */
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the saldo
	 */
	public float getSaldo() {
		return saldo;
	}
}
