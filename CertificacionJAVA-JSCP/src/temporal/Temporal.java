package temporal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Temporal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> listaString = new ArrayList<String>();
		listaString.add("parametrox");
		listaString.add(null);
		listaString.add("parametro1");
		listaString.add(null);
		listaString.add("parametro2");
		// String query = construirQuery(listaString);
		// System.out.println(query);

		Map<Integer, String> mapa = new HashMap<Integer, String>();

		mapa.put(1, "Johann");
		mapa.put(2, "Juan");
		mapa.put(3, "Carlos");

		Iterator<Entry<Integer, String>> iterator = mapa.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Integer, String> elemento = iterator.next();
			System.out.println(elemento.getKey() + ": " + elemento.getValue());

		}

		/*
		 * Collection<String> valores = mapa.values(); Iterator<String> iterador
		 * = valores.iterator(); boolean hayElementos = iterador.hasNext();
		 * while (hayElementos) { String elemento = iterador.next();
		 * System.out.println(elemento); hayElementos = iterador.hasNext(); }
		 */

	}

	private static String construirQuery(List<String> listaString) {

		StringBuilder clausula = new StringBuilder(" where ");

		for (String string : listaString) {
			if (string != null) {
				clausula.append("columnax = ").append("'").append(string)
						.append("'").append(" and ");
			}
		}

		clausula = new StringBuilder(clausula.toString().trim()
				.substring(0, clausula.toString().trim().length() - 3));

		return clausula.toString();
	}

}
