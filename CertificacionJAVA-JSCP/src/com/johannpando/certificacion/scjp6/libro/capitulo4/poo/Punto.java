package com.johannpando.certificacion.scjp6.libro.capitulo4.poo;

/**
 * Representa puntos geométricos caracterizados por dos coordenadas 'x' e 'y'.
 * 
 * @author jpandode
 * 
 */
public class Punto {

	private int x;
	private int y;

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Punto(int v) {
		x = v;
		y = v;
	}

	/**
	 * Método que dibuja las coordenadas x e y
	 */
	public void dibujar() {
		System.out.println("Las coordenadas son:" + x + ", " + y);
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

}
