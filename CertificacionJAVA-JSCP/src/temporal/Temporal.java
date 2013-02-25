package temporal;

import java.util.ArrayList;
import java.util.List;

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
		String query = construirQuery(listaString);
		System.out.println(query);
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
