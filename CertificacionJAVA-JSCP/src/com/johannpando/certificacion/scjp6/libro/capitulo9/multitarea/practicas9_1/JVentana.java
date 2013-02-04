package com.johannpando.certificacion.scjp6.libro.capitulo9.multitarea.practicas9_1;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class JVentana extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8576568675009306359L;
	JList jlistaexistentes;
	JList jlistabuffer;
	JList jlistaconsumidas;
	DefaultListModel dmexistentes;
	DefaultListModel dmconsumidas;
	// Constante pública que indica el número de cadenas a leer.
	public static final int TOTAL_CADENAS = 10;

	public JVentana() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setBounds(100, 50, 700, 400);
		dmexistentes = new DefaultListModel();
		dmconsumidas = new DefaultListModel();
		// Genera las cadenas y las almacena en la lista fuente.
		for (int i = 1; i <= JVentana.TOTAL_CADENAS; i++) {
			dmexistentes.addElement("Cadena: " + i);
		}

		// Creación de las listas a partir de las colecciones ListModel
		jlistaexistentes = new JList(dmexistentes);
		jlistabuffer = new JList();
		jlistaconsumidas = new JList(dmconsumidas);
		// Creación del botón comienzo.
		JButton jbotoncomenzar = new JButton("Comenzar");
		jbotoncomenzar.addActionListener(new Gestion(this));
		// Agrega las listas a paneles de desplazamiento.
		JScrollPane j1 = new JScrollPane(jlistaexistentes);
		JScrollPane j2 = new JScrollPane(jlistabuffer);
		JScrollPane j3 = new JScrollPane(jlistaconsumidas);
		JLabel jl1 = new JLabel("Cadenas disponibles");
		JLabel jl2 = new JLabel("Buffer");
		JLabel jl3 = new JLabel("Cadenas consumidas");
		// Posiciona los controles y añade al contenedor.
		jl1.setBounds(50, 50, 150, 20);
		jl2.setBounds(250, 50, 150, 20);
		jl3.setBounds(450, 50, 150, 20);
		j1.setBounds(50, 80, 150, 200);
		j2.setBounds(250, 80, 150, 200);
		j3.setBounds(450, 80, 150, 200);
		jbotoncomenzar.setBounds(270, 290, 120, 50);
		this.getContentPane().add(jl1);
		this.getContentPane().add(jl2);
		this.getContentPane().add(jl3);
		this.getContentPane().add(j1);
		this.getContentPane().add(j2);
		this.getContentPane().add(j3);
		this.getContentPane().add(jbotoncomenzar);
		this.setVisible(true);

	}
}
