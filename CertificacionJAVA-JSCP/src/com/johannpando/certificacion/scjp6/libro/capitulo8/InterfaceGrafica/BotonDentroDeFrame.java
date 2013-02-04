package com.johannpando.certificacion.scjp6.libro.capitulo8.InterfaceGrafica;

import java.awt.Button;
import java.awt.Frame;

public class BotonDentroDeFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Ventana1 v = new Ventana1("Ventana y botón", 30, 80, 400, 250);
	}

}

class Ventana1 extends Frame {
	Button b;

	public Ventana1(String titulo, int x, int y, int ancho, int alto) {
		super(titulo);
		this.setBounds(x, y, ancho, alto);
		// Se elimina el gestor de organización "layout". Tenndrá que ser
		// anulado para optar por disponer de los controles manuales.
		this.setLayout(null);
		b = new Button("Pulsar aquí");
		// Asigna tamaño y posición al botón respecto a la esquina superior
		// izquierda de la ventana
		b.setBounds(50, 50, 100, 30);
		// Añade el botón a la ventana
		this.add(b);
		// Visualiza el contenedor
		this.setVisible(true);
	}
}
