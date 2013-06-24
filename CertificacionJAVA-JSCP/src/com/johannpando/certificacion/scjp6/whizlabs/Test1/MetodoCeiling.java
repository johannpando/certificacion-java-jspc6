package com.johannpando.certificacion.scjp6.whizlabs.Test1;

import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class MetodoCeiling {
	public static void main(String[] args) {
		ConcurrentSkipListSet<String> mySet = new ConcurrentSkipListSet<String>();
		mySet.add("me");
		mySet.add("you");
		mySet.add("they");
		mySet.add("she");
		String newElement = mySet.ceiling("your");
		System.out.println(newElement);

		mas1();
	}

	private static void mas1() {
		ConcurrentSkipListSet<String> mySet = new ConcurrentSkipListSet<String>();
		mySet.add("johann");
		mySet.add("luis");
		mySet.add("ana");
		mySet.add("carlos");
		mySet.add("zara");
		mySet.add("marta");
		mySet.add("carlos");// No permite duplicados.

		// Imprime longi
		System.out.println("Tamanio: " + mySet.size());

		// Imprime ordenado
		for (String string : mySet) {
			System.out.println(" " + string);
		}
		System.out.println("Fin de imprimir conjunto de nombres.\n");

		// Probando el método ceiling
		String cadena = mySet.ceiling("marto");
		System.out.println("Probando ceiling: " + cadena + "\n");

		NavigableSet<String> cadena2 = mySet.headSet(cadena);
		for (String string : cadena2) {
			System.out.println("Probando headSet: " + string);
		}

	}
}