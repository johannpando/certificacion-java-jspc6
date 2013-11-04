package temasSueltos.excepcionesPersonalizadas;

public class HeredandoDeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1106766161327658700L;

	// De momento creo un constructor por defecto.
	public HeredandoDeException(String mensaje) {
		// Si no hago la llamada al contructor de Exception no va a mostrar el
		// error personalizado....
		super(mensaje);

	}

	public void metodoGenerarExceptionPersonalida() throws HeredandoDeException {

		throw new HeredandoDeException("Esta excepción la manejo yo: Exception");
	}

}
