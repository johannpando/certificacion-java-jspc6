package com.johannpando.certificacion.scjp6.libro.capitulo9.multitarea.InterfazRunnable;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Se crea unúnico objeto tarearb, el cual es compartido por todos los
		// thread.
		TareaRb t = new TareaRb();
		// Las tres tareas son instancias de la clase Thread.
		Thread t1 = new Thread(t, "elias");
		Thread t2 = new Thread(t, "pepe");
		Thread t3 = new Thread(t, "juan");
		// Se ponen en ejecución las tareas.
		t1.start();
		t2.start();
		t3.start();
	}

}
