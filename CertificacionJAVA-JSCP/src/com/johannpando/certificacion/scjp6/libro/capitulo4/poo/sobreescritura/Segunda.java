package com.johannpando.certificacion.scjp6.libro.capitulo4.poo.sobreescritura;

/***
 * Cuando se sobreescribe un método de una subclase, éste debe tener exactamente
 * el <strong>mismo formato que el método de la superclase que
 * sobreescribe.</strong> Esto significa que: <li>Deben llamarse igual.</li> <li>
 * Tener los mismos parámetros.</li> <li>Mismo tipo de
 * devolución.<strong>*</strong></li> <li>El m&eacute;todo sobrescrito puede
 * tener un modificador de acceso menos restrictivo que el de la superclase.</li>
 * <br>
 * <br>
 * <strong>*</strong><i> La versi&oacute;n 1.5 introduce una excepci&oacute;n a
 * este punto. Más detalle en la clase
 * <code>com.johannpando.certificacion.scjp6.libro.poo.poliformismo.TiposRetornoCovariantes</code>
 * </i> <br>
 * <br>
 * 
 * @author jpandode
 * 
 */
public class Segunda extends Primera {

	/**
	 * 
	 */
	@Override
	public void imprimir(String otroMensaje) {
		System.out.println("El mensaje es: ");
		System.out.println(otroMensaje);
	}

	/**
	 * Método sobrecargado
	 * 
	 * @param mensaje
	 */
	public void imprimir(int mensaje) {
		System.out.println(mensaje);
	}

	/**
	 * El m&eacute;todo sobrescrito puede tener un modificador de acceso menos
	 * restrictivo que el de la superclase.</li>
	 */
	public void imprimeMensaje(String mensaje) {
		System.out.println("Desde subclase");
	}

	/**
	 * ERROR: Cannot reduce the visibility of the inherited method from Primera
	 * No se puede reducir la visibilidad de la versión sobrescrita
	 */
	// void imprimeMensajes() {
	//
	// }

	public void llamandoMetodos() {
		imprimeMensaje("");// Llamada al método sobrescrito, se puede usar this.
		super.imprimeMensaje("");// Llamada al método original de la superclase
	}

}
