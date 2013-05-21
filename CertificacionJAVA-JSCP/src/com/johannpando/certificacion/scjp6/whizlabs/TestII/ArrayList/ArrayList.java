package com.johannpando.certificacion.scjp6.whizlabs.TestII.ArrayList;

public class ArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		java.util.ArrayList a = new java.util.ArrayList();
		a.add("1");
		a.add("2");
		a.add("3");
		/**
		 * El método toArray definido en la interfaz Colección se utiliza para
		 * convertir una colección en una matriz. La versión sobrecargada del
		 * método toArray utilizado en este código toma un argumento, que es el
		 * tipo de matriz a la que el tipo de cambio se va a emitir.
		 * 
		 * String [] s = a.toArray (nuevo String [0]), el contenido de la matriz
		 * de cadenas se imprimen.
		 * */
		String[] s = (String[]) a.toArray(new String[new Integer(0)]);
		for (String string : s) {
			System.out.println(string);
		}

		System.out.println(new String[165465]);
	}

}
