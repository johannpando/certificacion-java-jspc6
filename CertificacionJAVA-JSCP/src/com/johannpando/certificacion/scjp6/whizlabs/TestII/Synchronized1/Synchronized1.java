package com.johannpando.certificacion.scjp6.whizlabs.TestII.Synchronized1;

class Test {

	public void metodoSincronizadoOno() {

	}
}

public class Synchronized1 extends Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	/**
	 * Una subclase decide si un método heredado se debe marcar sincronizado o
	 * no.
	 */
	public synchronized void metodoSincronizadoOno() {
		metodoNoSincronizado();
	}

	/**
	 * Cuando un subproceso está ejecutando un método sincronizado, otros
	 * subprocesos no pueden acceder a los métodos sincronizados de ese objeto.
	 * Sin embargo, no hay restricciones sobre el acceso a los métodos no
	 * sincronizados del mismo objeto.
	 */
	public void metodoNoSincronizado() {

	}

	/**
	 * Los métodos estáticos se pueden sincronizar. En este caso, se obtiene el
	 * bloqueo en el objeto de clase
	 */
	public synchronized static void metodoEstaticoSincronizado() {

	}
}
