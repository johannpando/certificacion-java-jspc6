package temasSueltos.excepcionesPersonalizadas;

public class NoHeredandoDeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1592616023496537809L;

	// De momento creo un constructor por defecto.
	public NoHeredandoDeException(String mensaje) {
		// Si no hago la llamada al contructor de RuntimeException no va a
		// mostrar el
		// error personalizado....
		super(mensaje);

	}

	public void metodoGenerarExceptionPersonalida()
			throws NoHeredandoDeException {

		throw new NoHeredandoDeException(
				"Esta excepción la manejo yo RuntimeException");
	}
}
