package com.johannpando.certificacion.scjp6.libro.capitulo9.multitarea.ThreadObtenerThreadEnEjecucion;

public class Tarea extends Thread {

	public Tarea(String nombreThread) {
		super(nombreThread);
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("Nombre de la tarea: "
					+ Thread.currentThread().getName());

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
