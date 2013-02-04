package com.johannpando.certificacion.scjp6.libro.capitulo4.poo;

public class Circulo extends Figura {

	private float radio;

	/**
	 * 
	 * @param r
	 *            radio
	 * @param c
	 *            color
	 */
	public Circulo(float radio, String color) {
		super(color);
		this.radio = radio;
	}

	@Override
	public float area() {
		return (float) Math.PI * radio * radio;
	}

	/***
	 * TIPO DE RETORNO COVARIANTE - Hasta java 1.4
	 */
	// @Override
	// public Figura getNewFigura() {
	// return new Circulo(radio, getColor());
	// }

	/***
	 * TIPO DE RETORNO COVARIANTE - Desde Java 5 Se puede sobrescribir en la
	 * clase Circulo (que es subclase de la superclase Figura) de la siguiente
	 * manera:
	 * 
	 */

	@Override
	public Circulo getNewFigura() {
		return new Circulo(0, null);
	}
}
