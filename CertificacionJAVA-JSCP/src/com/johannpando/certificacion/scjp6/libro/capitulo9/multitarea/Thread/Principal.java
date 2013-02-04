package com.johannpando.certificacion.scjp6.libro.capitulo9.multitarea.Thread;

public class Principal {

	/**
	 * Aunque la clase Principal no hereda de Thread, el código contenido en el
	 * método main() también es considerado como una tarea más por la JVM. Esto
	 * significa que si hubiera otras instrucciones después de las llamadas a
	 * start() de los threads, éstas serían ejecutadas concurrentemente con el
	 * resto de las tareas. <br>
	 * <br>
	 * El hecho de poner a dormir un tiempo las tareas provoca que los mensajes
	 * generados por ellas estén más sincronizados.<br>
	 * <br>
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Tarea1 t1 = new Tarea1();
		Tarea2 t2 = new Tarea2();
		t1.start();
		t2.start();
		System.out.println("jojan");
	}

}
