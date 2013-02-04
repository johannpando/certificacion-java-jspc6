package com.johannpando.certificacion.scjp6.libro.capitulo8.InterfaceGrafica.gestionEventos;

import java.awt.Frame;

public class Ventana extends Frame {

	public Ventana(String titulo, int x, int y, int ancho, int alto) {
		super(titulo);
		this.setBounds(x, y, ancho, alto);
		// crea el escuchador
		GestionVentana g = new GestionVentana();
		// asocia el objeto ventana con el escuchador.
		this.addWindowListener(g);
		this.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ventana v = new Ventana("Interface escucha", 10, 30, 50, 100);

	}

}
