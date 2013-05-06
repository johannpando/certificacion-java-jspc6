package com.johannpando.certificacion.scjp6.whizlabs.TestII.diferenciaEntreTreeMapHashSetArrayListHashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * HashMap, implementa la interface Map. No es ni ordenada ni clasificada.
 * Permite una clave null y múltiples valores null. Es la que ofrece mejor
 * rendimiento de todos los Map.
 * 
 * @author Johann
 * 
 */
public class HashMapClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(null, "uno");
		hashMap.put(1, "uno");
		hashMap.put(null, "dos");

		Collection<String> values = hashMap.values();

		System.out.println(hashMap.size());

		for (String string : values) {
			System.out.println(string);
		}
		recorrerPorClave(hashMap);

		recorrerPorValorClave(hashMap);

		recorrerHashMapIterator(hashMap);

	}

	private static void recorrerHashMapIterator(HashMap<Integer, String> hashMap) {
		System.out.println("##############ITERATOR#################");
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();

		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();

		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) iterator
					.next();
			System.out.println(entry.getKey() + " - " + entry.getValue());

		}
	}

	/**
	 * Devuelve una vista de conjunto de las asignaciones que figuran en este
	 * mapa. El conjunto está respaldado por el mapa, por lo que los cambios en
	 * el mapa se reflejan en el set, y vice-versa. Si el mapa es modificado
	 * mientras una iteración sobre el conjunto está en curso (excepto a través
	 * de propia operación remove del iterador, oa través de la operación
	 * setValue en una entrada de mapa devuelto por el iterador) los resultados
	 * de la iteración no están definidos. El conjunto soporta la eliminación
	 * del elemento, que elimina el mapeo correspondiente del mapa, a través de
	 * la Iterator.remove, Set.remove, removeAll, retainAll y operaciones de
	 * borrado. No es compatible con las operaciones de adición o addAll.
	 * 
	 * <p>
	 * Resumen: Permite recuperar por valor y por llave
	 * <p>
	 * 
	 * @param hashMap
	 */
	private static void recorrerPorValorClave(HashMap<Integer, String> hashMap) {
		System.out
				.println("###################VALOR Y CLAVE########################");
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
	}

	private static void recorrerPorClave(HashMap<Integer, String> hashMap) {
		System.out.println("################CLAVE################");
		Set<Integer> keySet = hashMap.keySet();
		for (Integer integer : keySet) {
			System.out.println(integer);
		}
	}
}
