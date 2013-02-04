package com.johannpando.certificacion.scjp6.libro.capitulo9.multitarea.ThreadObtenerThreadEnEjecucion;

public class Principal {

	/**
	 * El programa consiste en la creaci�n de tres tareas encargadas de mostrar
	 * su nombre en pantalla (utilizando el m�todo getName del m�todo st�tico
	 * currentThread), 100 veces, ejecut�ndose en modo multitarea.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Tarea t1 = new Tarea("Johann");
		Tarea t2 = new Tarea("Juan");
		Tarea t3 = new Tarea("Jos�");
		t1.start();
		t2.start();
		t3.start();

	}

}
