package com.johannpando.certificacion.scjp6.whizlabs.TestII.Thread;

/**
 * <p>
 * Inglés
 * </p>
 * The code compiles fine but prints One, Two, and Three each 20 times in an
 * indefinite order due to wrong synchronization mechanism applied to print them
 * in order.
 * 
 * Choice A is clearly incorrect as the for loop resides within the method and
 * there is no such code that ensures that a thread printing the value of the
 * String 'msg' will print the value only once before another thread comes and
 * executes the same statement.
 * 
 * Notice that in Line 1, 2, 3 the main thread starts the other three threads
 * that all get the same priority of the main thread. So there is no guarantee
 * that they will always be printed in the same order, which confirms that
 * choice C is false.
 * 
 * Choice B would be true only if the display method would have been
 * synchronized instead of the String 'msg'. There is no point in synchronizing
 * the local String 'msg' to control the behavior of three threads.
 * 
 * Instead, a common static reference or 'this' reference may be tried as
 * alternatives to achieve the behavior. So, choice D is correct.
 * <p>
 * Castellano
 * <p>
 * El código compila bien pero no se imprime Uno, Dos y Tres cada 20 veces en un
 * orden indefinido debido al mecanismo de sincronización mal aplicada para
 * imprimir en orden.
 * 
 * Opción A es claramente incorrecto, ya que el bucle for reside en el método y
 * no existe tal código que garantiza que un hilo de imprimir el valor de 'MSG'
 * de la cadena se imprimirá el valor sólo una vez antes de que otro hilo salga
 * y ejecuta la misma instrucción.
 * 
 * Nótese que en la línea 1, 2, 3 el hilo principal empieza las otras tres hilos
 * que todos conseguimos la misma prioridad del hilo principal. Así que no hay
 * ninguna garantía de que siempre se imprimirán en el mismo orden, lo que
 * confirma que la opción C es falsa.
 * 
 * La opción B sería cierto sólo si el método display se hubiera sincronizado en
 * vez de 'MSG' de la cadena. No hay ningún punto en la sincronización de 'MSG'
 * la cadena local para controlar el comportamiento de tres hilos.
 * 
 * En su lugar, una referencia estática común o "this" de referencia pueden ser
 * juzgados como alternativas para lograr el comportamiento. Por lo tanto, la
 * elección de D es la correcta.
 * 
 * @author Johann
 * 
 */
public class OrderedThread {
	public static void main(String[] args) {
		MBThread first, second, third;
		OrderedThread orderedThread = new OrderedThread();
		first = new MBThread("One", orderedThread);
		second = new MBThread("Two", orderedThread);
		third = new MBThread("Three", orderedThread);
		second.start(); // Line 1
		first.start(); // Line 2
		third.start(); // Line 3
	}

	public void display(String msg) {
		synchronized (msg) {// Cambiando a this se imprime de forma ordenada
			for (int i = 1; i <= 20; i++) {
				System.out.println("Name= " + msg);
			}
		}
	}
}

class MBThread extends Thread {
	String name;
	OrderedThread orderT;

	MBThread(String name, OrderedThread orderT) {
		this.name = name;
		this.orderT = orderT;
	}

	public void run() {
		orderT.display(name);
	}
}
