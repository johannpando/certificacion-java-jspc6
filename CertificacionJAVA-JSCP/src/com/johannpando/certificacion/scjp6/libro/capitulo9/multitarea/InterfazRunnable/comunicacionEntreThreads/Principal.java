package com.johannpando.certificacion.scjp6.libro.capitulo9.multitarea.InterfazRunnable.comunicacionEntreThreads;

/**
 * El siguiente ejemplo pretende alcar el funcionamiento de los métodos wait y
 * notify.<br>
 * <br>
 * En él se presenta una subclase de Thread, llamada Proceso, con un método
 * run() encargado de calcular la suma de los 5 primeros números naturales. Por
 * otro lado, tenemos una clase con su método main(), cuya misión es instanciar
 * un Thread a partir de la clase resultado mostrado por el método main() sea
 * correcto, necesitará esperar a que el thread ed Proceso le notifique que ha
 * terminado de realizar la operación.
 * 
 * @author jpandode
 * 
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Crea un objeto de la clase que realiza el cálculo y lo pone en
		// ejecución concurrente con main()
		Proceso p = new Proceso();
		p.start();
		// Aquí el método main() podría realizar cualquier tarea.
		synchronized (p) {
			try {
				// Espera que finalice el cálculo
				p.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("La suma total es " + p.getValor());
	}

}
