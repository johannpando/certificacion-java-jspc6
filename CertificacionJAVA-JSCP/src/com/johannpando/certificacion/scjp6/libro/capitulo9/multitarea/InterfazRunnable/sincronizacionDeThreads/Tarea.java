package com.johannpando.certificacion.scjp6.libro.capitulo9.multitarea.InterfazRunnable.sincronizacionDeThreads;

import com.johannpando.certificacion.scjp6.libro.capitulo9.multitarea.InterfazRunnable.NOsincronizacionDeThreads.Accesos;

/**
 * La solución al problema planteado en el paquete
 * <code>com.johannpando.certificacion.scjp6.libro.capitulo9.multitarea.InterfazRunnable.NOsincronizacionDeThreads</code>
 * es de sincronizar el bloque de código, el cual se basa en monitores o
 * "cerrojos". <br>
 * <br>
 * En el momento en que un Thread entra en el bloque sincronizado, adquiere el
 * monitor del objeto especificado, bloqueando la entrada de otros threads al
 * bloqe hasta que el monitor del objeto sea liberado, hecho que sucede
 * automaticamente cuando el thread finaliza la ejecución del bloque
 * sincronizado. <br>
 * <br>
 * Hay que tener en cuenta que cuando un thread se va a dormir, se lleva el
 * monitor del objeto consigo.<br>
 * 
 * @author jpandode
 * 
 */
public class Tarea implements Runnable {

	Accesos ac;

	public Tarea() {
		ac = new Accesos();
	}

	@Override
	public void run() {

		synchronized (ac) {
			int actual = ac.getCont();
			actual++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ac.setCont(actual);
			System.out.println("Total accesos: " + ac.getCont());
		}
	}

}
