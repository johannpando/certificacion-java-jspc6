package com.johannpando.certificacion.scjp6.whizlabs.TestII.ConcurrentSkipListSet_NavigableSet;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class NavigableMap1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		conociendoNavigableMap();

	}

	private static void conociendoNavigableMap() {
		Map<Integer, String> m = new HashMap<Integer, String>();
		SortedMap<Integer, String> sm = null;

		ConcurrentNavigableMap<String, Integer> nm1 = new ConcurrentSkipListMap<String, Integer>();
		nm1.put("ab", 10);
		nm1.put("cd", 5);
		nm1.put("ca", 30);
		nm1.put("c", 30);
		nm1.put("az", 20);

		NavigableMap<String, Integer> nm2 = nm1.tailMap("c", true);

		System.out.println(nm1.size() + " " + nm2.size());
	}

}
