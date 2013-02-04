package com.johannpando.certificacion.scjp6.libro.capitulo9.multitarea.InterfazRunnable.sincronizacionDeThreads;

public class Ejecucion {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Tarea t = new Tarea();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}

}
