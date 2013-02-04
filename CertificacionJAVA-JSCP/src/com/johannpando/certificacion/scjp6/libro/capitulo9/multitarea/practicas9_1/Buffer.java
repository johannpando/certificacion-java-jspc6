package com.johannpando.certificacion.scjp6.libro.capitulo9.multitarea.practicas9_1;

import javax.swing.DefaultListModel;

/**
 * El buffer se implementa como un ListModel
 * 
 * @author jpandode
 * 
 */
public class Buffer extends DefaultListModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2405449666894473234L;

	private int limite;

	public Buffer(int l) {
		limite = l;
	}

	public void agregar(Object o) {
		if (!isFull()) {
			this.addElement(o);
		}
	}

	public Object extraer() {
		return this.remove(0);
	}

	public boolean isFull() {
		if (this.getSize() >= limite) {
			return true;
		} else {
			return false;
		}
	}

}
