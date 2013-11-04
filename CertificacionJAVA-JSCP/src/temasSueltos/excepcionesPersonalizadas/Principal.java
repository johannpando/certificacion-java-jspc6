package temasSueltos.excepcionesPersonalizadas;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HeredandoDeException h = new HeredandoDeException(null);

		// try {
		// h.metodoGenerarExceptionPersonalida();
		// } catch (HeredandoDeException e) {
		// // No se muestra información si no utilizamos la variable e
		// e.printStackTrace();
		// }

		NoHeredandoDeException nh = new NoHeredandoDeException(null);

		// Es curioso, pero al no heredar de exception, no me obliga a
		// capturarlo o reelanzarlo. TOOOORRRRRRPEEEEE SOOOOOSSSSS!!!!
		// JEJE, no me obliga porque al heredar de RuntimeException, se
		// convierte en una excepción NO MARCADA...

		// Pero si no lo encerramos en un try catch..... el programa se
		// detendrá, es decir, no pintará el syso....
		nh.metodoGenerarExceptionPersonalida();

		System.out.println("Hago más cosas aquí");
	}

}
