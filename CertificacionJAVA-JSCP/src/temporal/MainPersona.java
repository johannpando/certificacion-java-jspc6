package temporal;

import java.util.ArrayList;
import java.util.List;

public class MainPersona {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List lista = new ArrayList();
		Persona p = new Persona();

		p.setNombre("Luis");
		lista.add(p);

		Persona p2 = new Persona();
		p2 = (Persona) lista.get(0);
		p2.setNombre("Juan");

		Persona p3 = (Persona) lista.get(0);
		System.out.println(p3.getNombre());

	}

}
