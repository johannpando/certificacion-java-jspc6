package temporal;

public class Castellano implements Traducir {

	@Override
	public void leer() {
		System.out.println("Traduciré en castellano");
	}

	@Override
	public Traducir getInterfaceTraducir() {
		return new Castellano();
	}

}
