package com.johannpando.certificacion.scjp6.libro.capitulo9.multitarea.InterfazRunnable.comunicacionEntreThreads;

public class Proceso extends Thread {

	private int valor;

	public int getValor() {
		// Devuelve el c�lculo realizado.
		return valor;
	}

	public void run() {
		// Bloque de c�digo sincronizado donde se obtiene el monitor del propio
		// objeto, proceso para que ning�n otro thread pueda utilizarlo mientras
		// completa el c�lculo.
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				valor += i;
			}
			// Avisa de que ha finalizado el c�lculo al thread que invoc� a
			// wait() sobre el objeto, a fin de que pueda continuar la
			// ejecuci�n.
			this.notify();
		}
	}
}
