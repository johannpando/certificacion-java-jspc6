package temporal;

import java.util.ArrayList;

public class Traductor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Traducir castellano = new Castellano();
		// Traducir aleman = new Aleman();
		// Traducir ingles = new Ingles();
		//
		// castellano.leer();
		// aleman.leer();
		// ingles.leer();

		genericoLeer(new Castellano());
		genericoLeer(new Ingles());
		genericoLeer(new Aleman());

		Castellano c = new Castellano();
		Castellano x = (Castellano) c.getInterfaceTraducir();
		x.leer();

		Ingles i = new Ingles();
		Ingles y = i.getInterfaceTraducir();
		y.leer();

		ArrayList<Object> listaObjetos = new ArrayList<Object>();
		listaObjetos.add(new Float(0));

	}

	private static void genericoLeer(Traducir t) {
		t.leer();
	}

}
