package com.johannpando.certificacion.scjp6.libro.capitulo9.multitarea.InterfazRunnable.NOsincronizacionDeThreads;

public class Ejecucion {

	/**
	 * A partir de este momento los Threads comienzan su ejecuci�n concurrente.
	 * Como ya sabemos no es posible saber que va a pasar pero podr�a darse la
	 * siguiente situaci�n:<br>
	 * <br>
	 * El Thread t1 comienza su ejecuci�n y llega a completarla, en ese momento
	 * el total de accesos es 1. Despu�s el Thread t2 comienza su ejecuci�n y
	 * justo antes de hacer la llamada al m�todo setCont(), el gestor de tareas
	 * lo saca de ejecuci�n para poner en funcionamiento a t3. Y es aqu� donde
	 * viene el problema: como t2 no lleg� a actualizar el valor contador,
	 * cuando t3 invoque a getValor() obtendr� el valor 2 en vez de 3.<br>
	 * <br>
	 * Para paliar este problema, la soluci�n pasa por hacer algo que impida a
	 * un Thread utilizar el objeto Accesos mientras el �ltimo Thread que lo ha
	 * utilizado no haya completado la llamada al m�todo setValor. Esto se
	 * consigue mediante la sincronizaci�n.<br>
	 * <br>
	 * M�s informaci�n en el paquete
	 * <code>com.johannpando.certificacion.scjp6.libro.capitulo9.multitarea.InterfazRunnable.sincronizacionDeThreads</code>
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
