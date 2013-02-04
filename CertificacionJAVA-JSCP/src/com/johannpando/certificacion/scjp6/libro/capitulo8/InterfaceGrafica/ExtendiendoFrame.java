package com.johannpando.certificacion.scjp6.libro.capitulo8.InterfaceGrafica;

import java.awt.Frame;

public class ExtendiendoFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Ventana v = new Ventana("Nueva ventana", 30, 80, 400, 250);
	}

}

class Ventana extends Frame {

	public Ventana(String titulo, int x, int y, int ancho, int alto) {
		super(titulo);
		this.setBounds(x, y, ancho, alto);
		this.setVisible(true);
	}
}
