package com.johannpando.certificacion.scjp6.libro.capitulo9.multitarea.practicas9_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase para gestión del evento click sobre el botón "comenzar".
 * 
 * @author jpandode
 * 
 */
public class Gestion implements ActionListener {

	JVentana jv;

	public Gestion(JVentana jv) {
		this.jv = jv;
	}

	/**
	 * Se ejecuta cuando se hace clic sobre el botón comenzar.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		// Crea el buffer y le asigna tamaño máximo, por ejemplo 4.
		Buffer bf = new Buffer(4);
		// Asocia el buffer al JList
		jv.jlistabuffer.setModel(bf);
		// Pone los dos procesos en ejecución concurrente.
		Thread t1 = new Consumidor(bf, jv);
		Thread t2 = new Productor(bf, jv);
		t1.start();
		t2.start();
	}

}
