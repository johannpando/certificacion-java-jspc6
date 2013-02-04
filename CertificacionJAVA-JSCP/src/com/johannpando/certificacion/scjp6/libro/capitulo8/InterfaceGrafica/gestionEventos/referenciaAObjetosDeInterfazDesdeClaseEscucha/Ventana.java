package com.johannpando.certificacion.scjp6.libro.capitulo8.InterfaceGrafica.gestionEventos.referenciaAObjetosDeInterfazDesdeClaseEscucha;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

/**
 * Pasos para desarrollar una aplicación gráfica basada en eventos. <li>
 * Implementar clase de escucha.- En nuestro caso, la clase GestionBoton es la
 * que implementa la clase escucha ActionListener.</li> <li>Crear los objetos de
 * escucha.- En nuestro caso instanciar la clase GestionBoton y pasar en el
 * constructor la clase Ventana.</li> <li>
 * Asociar el objeto origen del evento con su escuchador.- En nuestro caso
 * asociamos el botón con su método addActionListener, pasándole la clase que
 * implementa el ActionListener.</li> <br>
 * <br>
 * 
 * @author jpandode
 * 
 */
public class Ventana extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -159476971349506692L;
	/**
	 * @param args
	 */

	Button bt;
	TextField tf;
	Label lb;

	public Ventana(String titulo, int x, int y, int width, int height) {

		super(titulo);
		this.setBounds(x, y, width, height);
		this.setLayout(null);
		bt = new Button("Mostrar Texto");
		bt.setBounds(150, 200, 100, 30);
		tf = new TextField();
		tf.setBounds(150, 70, 100, 30);
		lb = new Label("..............");
		lb.setBounds(150, 130, 100, 30);
		// Se pasa el objeto ventana al constructor de la clase que gestionará
		// el evento ActionEvent
		GestionBoton gb = new GestionBoton(this);
		// Asociación objeto origen-escuchador
		bt.addActionListener(gb);
		this.add(bt);
		this.add(lb);
		this.add(tf);
		// Asocio ésta clase, Ventana, a su escuchador.
		this.addWindowListener(new GestionVentana());
		this.setVisible(true);

	}
}
