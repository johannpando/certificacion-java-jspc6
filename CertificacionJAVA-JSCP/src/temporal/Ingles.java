package temporal;

public class Ingles implements Traducir {

	@Override
	public void leer() {
		System.out.println("Traduciré en inglés");
	}

	@Override
	public Ingles getInterfaceTraducir() {
		return new Ingles();
	}

}
