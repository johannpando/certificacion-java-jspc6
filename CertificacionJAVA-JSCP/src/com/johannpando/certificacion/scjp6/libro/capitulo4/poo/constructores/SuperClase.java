package com.johannpando.certificacion.scjp6.libro.capitulo4.poo.constructores;

public class SuperClase {

	private String atributo1;
	private String atributo2;

	/***
	 * Constructor por defecto - Se comenta para realizar pruebas de
	 * CONSTRUCTOR-HERENCIA
	 */
	// public SuperClase() {
	// System.out.println("superclase");
	// atributo1 = "atributo1";
	// atributo2 = "atributo2";
	// }

	/**
	 * Constructor con 1 parámetro
	 * 
	 * @param atributo1
	 */
	public SuperClase(String atributo1) {
		this.atributo1 = atributo1;
	}

	/**
	 * Constructor con 2 parámetros
	 * 
	 * @param atributo1
	 * @param atributo2
	 */
	public SuperClase(String atributo1, String atributo2) {
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
	}

	/**
	 * @return the atributo1
	 */
	public String getAtributo1() {
		return atributo1;
	}

	/**
	 * @param atributo1
	 *            the atributo1 to set
	 */
	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}

	/**
	 * @return the atributo2
	 */
	public String getAtributo2() {
		return atributo2;
	}

	/**
	 * @param atributo2
	 *            the atributo2 to set
	 */
	public void setAtributo2(String atributo2) {
		this.atributo2 = atributo2;
	}

}
