package com.johannpando.certificacion.scjp6.libro.capitulo9.multitarea.InterfazRunnable.NOsincronizacionDeThreads;

public class Ejecucion {

	/**
	 * A partir de este momento los Threads comienzan su ejecución concurrente.
	 * Como ya sabemos no es posible saber que va a pasar pero podría darse la
	 * siguiente situación:<br>
	 * <br>
	 * El Thread t1 comienza su ejecución y llega a completarla, en ese momento
	 * el total de accesos es 1. Después el Thread t2 comienza su ejecución y
	 * justo antes de hacer la llamada al método setCont(), el gestor de tareas
	 * lo saca de ejecución para poner en funcionamiento a t3. Y es aquí donde
	 * viene el problema: como t2 no llegó a actualizar el valor contador,
	 * cuando t3 invoque a getValor() obtendrá el valor 2 en vez de 3.<br>
	 * <br>
	 * Para paliar este problema, la solución pasa por hacer algo que impida a
	 * un Thread utilizar el objeto Accesos mientras el último Thread que lo ha
	 * utilizado no haya completado la llamada al método setValor. Esto se
	 * consigue mediante la sincronización.<br>
	 * <br>
	 * Más información en el paquete
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
