package com.johannpando.certificacion.scjp6.libro.capitulo9.multitarea.ThreadObtenerThreadEnEjecucion;

public class Principal {

	/**
	 * El programa consiste en la creación de tres tareas encargadas de mostrar
	 * su nombre en pantalla (utilizando el método getName del método stático
	 * currentThread), 100 veces, ejecutándose en modo multitarea.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Tarea t1 = new Tarea("Johann");
		Tarea t2 = new Tarea("Juan");
		Tarea t3 = new Tarea("José");
		t1.start();
		t2.start();
		t3.start();

	}

}
