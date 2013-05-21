package com.johannpando.certificacion.scjp6.whizlabs.TestII.ConcurrentSkipListSet_NavigableSet;

import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSet_NavigableSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcurrentSkipListSet<String> mySet = new ConcurrentSkipListSet<String>();
		mySet.add("me");
		mySet.add("you");
		mySet.add("your");
		mySet.add("they");
		mySet.add("she");
		// El método headset (toElement) de NavigableSet devuelve una vista de
		// la parte del conjunto cuyos elementos son menos que toElement. No hay
		// ningún elemento en el conjunto que es menor que "m". Por lo tanto el
		// conjunto está vacío y el método size () imprime 0.
		NavigableSet<String> mySet1 = mySet.headSet("m");
		System.out.println(mySet1.size());
	}

}
