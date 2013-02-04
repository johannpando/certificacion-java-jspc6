package com.johannpando.certificacion.scjp6.libro.capitulo8.InterfaceGrafica.gestionEventos.referenciaAObjetosDeInterfazDesdeClaseEscucha;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionBoton implements ActionListener {

	Ventana v;

	public GestionBoton(Ventana v) {
		this.v = v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// recupera el contenido del TextField
		String s = v.tf.getText();
		// asigna su valor al control label
		v.lb.setText(s);

	}

}
