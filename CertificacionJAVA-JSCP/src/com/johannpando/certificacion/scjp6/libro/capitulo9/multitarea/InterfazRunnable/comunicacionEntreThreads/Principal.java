package com.johannpando.certificacion.scjp6.libro.capitulo9.multitarea.InterfazRunnable.comunicacionEntreThreads;

/**
 * El siguiente ejemplo pretende alcar el funcionamiento de los m�todos wait y
 * notify.<br>
 * <br>
 * En �l se presenta una subclase de Thread, llamada Proceso, con un m�todo
 * run() encargado de calcular la suma de los 5 primeros n�meros naturales. Por
 * otro lado, tenemos una clase con su m�todo main(), cuya misi�n es instanciar
 * un Thread a partir de la clase resultado mostrado por el m�todo main() sea
 * correcto, necesitar� esperar a que el thread ed Proceso le notifique que ha
 * terminado de realizar la operaci�n.
 * 
 * @author jpandode
 * 
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Crea un objeto de la clase que realiza el c�lculo y lo pone en
		// ejecuci�n concurrente con main()
		Proceso p = new Proceso();
		p.start();
		// Aqu� el m�todo main() podr�a realizar cualquier tarea.
		synchronized (p) {
			try {
				// Espera que finalice el c�lculo
				p.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("La suma total es " + p.getValor());
	}

}
