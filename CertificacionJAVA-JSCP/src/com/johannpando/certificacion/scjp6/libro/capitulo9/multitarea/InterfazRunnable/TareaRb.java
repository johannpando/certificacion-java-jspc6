package com.johannpando.certificacion.scjp6.libro.capitulo9.multitarea.InterfazRunnable;

public class TareaRb implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 20; i++) {
			System.out.println("Nombre tarea: "
					+ Thread.currentThread().getName());

			// Poner a dormir la tarea
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
