package temasSueltos.excepcionesPersonalizadas;

@SuppressWarnings("serial")
class NoHeredandoException extends RuntimeException {

	public void lanzaRuntimeException() throws RuntimeException {
		throw new RuntimeException("Exc. Person. RuntimeException");
	}
}

public class NoHeredandoExceptionMain {

	public static void main(String[] args) {
		new NoHeredandoException().lanzaRuntimeException();
		System.out.println("Excepciones");
	}

}
