package com.johannpando.certificacion.scjp6.libro.capitulo9.multitarea.InterfazRunnable.NOsincronizacionDeThreads;

public class Tarea implements Runnable {

	Accesos ac;

	public Tarea() {
		ac = new Accesos();
	}

	@Override
	public void run() {

		int actual = ac.getCont();
		actual++;

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ac.setCont(actual);
		System.out.println("Total accesos: " + ac.getCont());
	}

}
