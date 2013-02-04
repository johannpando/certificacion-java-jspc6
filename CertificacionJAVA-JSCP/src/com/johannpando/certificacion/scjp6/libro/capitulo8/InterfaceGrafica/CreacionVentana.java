package com.johannpando.certificacion.scjp6.libro.capitulo8.InterfaceGrafica;

import java.awt.Frame;

public class CreacionVentana {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Frame f = new Frame("Primera ventana");
		f.setBounds(100, 100, 400, 250);
		f.setVisible(true);
	}

}
