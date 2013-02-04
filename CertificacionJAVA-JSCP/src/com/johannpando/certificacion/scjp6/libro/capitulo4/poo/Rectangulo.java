package com.johannpando.certificacion.scjp6.libro.capitulo4.poo;

public class Rectangulo extends Figura {

	private float base;
	private float altura;

	/**
	 * 
	 * @param b
	 *            base
	 * @param a
	 *            altura
	 * @param c
	 *            color
	 */
	public Rectangulo(float a, float b, String c) {
		super(c);
		this.altura = a;
		this.base = b;
	}

	@Override
	public float area() {
		return base * altura;
	}

	@Override
	public Figura getNewFigura() {
		// TODO Auto-generated method stub
		return null;
	}

}
