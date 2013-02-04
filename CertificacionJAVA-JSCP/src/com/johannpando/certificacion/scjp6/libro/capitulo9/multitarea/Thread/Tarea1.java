package com.johannpando.certificacion.scjp6.libro.capitulo9.multitarea.Thread;

/**
 * El método sleep pone a dormir la tarea puede provocar un
 * InterruptedException.
 * 
 * @author jpandode
 * 
 */
public class Tarea1 extends Thread {

	/**
	 * Debemos sobrescribir el método run
	 */
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("El número es el: " + i);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
