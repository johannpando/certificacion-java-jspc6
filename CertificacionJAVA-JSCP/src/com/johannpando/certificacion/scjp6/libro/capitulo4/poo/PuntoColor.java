package com.johannpando.certificacion.scjp6.libro.capitulo4.poo;

/**
 * @author jpandode
 * 
 */
public class PuntoColor extends Punto {

	private String color;

	/**
	 * Constructor con parámetros de la clase <code>PuntoColor</code>
	 * 
	 * @param x
	 * @param y
	 * @param color
	 */
	public PuntoColor(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public PuntoColor(int x, String color) {
		// Invoca al otro constructor de la clase
		this(x, x, color);
	}

	public void dibujar() {
		super.dibujar();// Ejecuta la versión definida en Punto
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

}
