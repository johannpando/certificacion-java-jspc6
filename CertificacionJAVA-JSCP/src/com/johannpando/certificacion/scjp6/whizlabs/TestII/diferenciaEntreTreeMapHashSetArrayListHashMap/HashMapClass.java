package com.johannpando.certificacion.scjp6.whizlabs.TestII.diferenciaEntreTreeMapHashSetArrayListHashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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

	HashMap<Integer, Persona> mapaPersonasUno = new HashMap<Integer, Persona>();
	HashMap<Integer, Persona> mapaPersonasDos = new HashMap<Integer, Persona>();

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

		mapaPersonas();

		HashMapClass hashMapClass = new HashMapClass();
		hashMapClass.sobrescribiendoEquals();

	}

	public void sobrescribiendoEquals() {
		System.out
				.println("################# PROBANDO A SOBRESCRIBIR EQUALS ##################");

		Persona personaUnica = new Persona("12345", "Pérez", "Juan");

		mapaPersonasUno.put(1, personaUnica);
		// mapaPersonasUno.put(2, new Persona("22222", "García", "Julio"));
		// mapaPersonasUno.put(3, new Persona("33333", "Mendoza", "Juana"));

		mapaPersonasDos.put(1, personaUnica);
		// mapaPersonasDos.put(2, new Persona("22222", "García", "Julio"));
		// mapaPersonasDos.put(3, new Persona("33333", "Mendoza", "Juana"));

		System.out.println(mapaPersonasDos.equals(mapaPersonasUno));

	}

	private static void mapaPersonas() {
		HashMap<Persona, List<Persona>> mapaPersonas = new HashMap<Persona, List<Persona>>();
		Persona jp = new Persona("54211142G", "Pando", "Johann");
		Persona l = new Persona("X4626146L", "Millán", "Susan");
		Persona Gi = new Persona("A82371279", "Pando", "Giessel");
		Persona Om = new Persona("123456789", "Nomberto", "Omar");

		List<Persona> listaPersonas = new java.util.ArrayList<Persona>();
		listaPersonas.add(jp);
		listaPersonas.add(l);
		listaPersonas.add(Gi);
		listaPersonas.add(Om);

		mapaPersonas.put(jp, listaPersonas);

		eliminaPersonaPorPersona(jp, mapaPersonas);
	}

	private static void eliminaPersonaPorPersona(Persona p,
			Map<Persona, List<Persona>> mapaPersonas) {

		if (mapaPersonas.containsKey(p)) {
			mapaPersonas.remove(p);
		}

		System.out.println(mapaPersonas.size());
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((mapaPersonasDos == null) ? 0 : mapaPersonasDos.hashCode());
		result = prime * result
				+ ((mapaPersonasUno == null) ? 0 : mapaPersonasUno.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashMapClass other = (HashMapClass) obj;
		if (mapaPersonasDos == null) {
			if (other.mapaPersonasDos != null)
				return false;
		} else if (!mapaPersonasDos.equals(other.mapaPersonasDos))
			return false;
		if (mapaPersonasUno == null) {
			if (other.mapaPersonasUno != null)
				return false;
		} else if (!mapaPersonasUno.equals(other.mapaPersonasUno))
			return false;
		return true;
	}
}
