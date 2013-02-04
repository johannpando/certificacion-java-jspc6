package com.johannpando.certificacion.scjp6.libro.capitulo8.InterfaceGrafica.gestionEventos.referenciaAObjetosDeInterfazDesdeClaseEscucha;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GestionVentana extends WindowAdapter {

	public void windowClosing(WindowEvent e) {

		System.exit(0);

	}
}
