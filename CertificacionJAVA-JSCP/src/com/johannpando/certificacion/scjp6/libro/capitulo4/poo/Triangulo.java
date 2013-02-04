package com.johannpando.certificacion.scjp6.libro.capitulo4.poo;

public class Triangulo extends Figura {

	private float base, altura;

	/**
	 * 
	 * @param b
	 *            base
	 * @param a
	 *            altura
	 * @param c
	 *            color
	 */
	public Triangulo(float b, float a, String c) {
		super(c);
		base = b;
		altura = a;
	}

	@Override
	public float area() {
		return base * altura / 2;
	}

	@Override
	public Figura getNewFigura() {
		// TODO Auto-generated method stub
		return null;
	}

}
