package com.johannpando.certificacion.scjp6.libro.capitulo9.multitarea.InterfazRunnable.comunicacionEntreThreads;

public class Proceso extends Thread {

	private int valor;

	public int getValor() {
		// Devuelve el cálculo realizado.
		return valor;
	}

	public void run() {
		// Bloque de código sincronizado donde se obtiene el monitor del propio
		// objeto, proceso para que ningún otro thread pueda utilizarlo mientras
		// completa el cálculo.
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				valor += i;
			}
			// Avisa de que ha finalizado el cálculo al thread que invocó a
			// wait() sobre el objeto, a fin de que pueda continuar la
			// ejecución.
			this.notify();
		}
	}
}
