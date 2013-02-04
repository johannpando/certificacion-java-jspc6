package com.johannpando.certificacion.scjp6.libro.capitulo4.poo.poliformismo;

import com.johannpando.certificacion.scjp6.libro.capitulo4.poo.Circulo;

/**
 * Al hablar de la sobrescritura de m�todos en una subclase, una de las
 * condiciones erar la de mantener invariable el tipo de retorno definifo por el
 * m�todo original.
 * 
 * A partir de java 5 es posible modificar el tipo de retorno alsobrescribir un
 * m�todo, siempre y cuando el <strong>nuevo tipo sea un subtipo (subclase) del
 * original</strong>
 * 
 * @author jpandode
 * 
 */
public class TiposRetornoCovariantes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * Suponiendo que cir es una variable que contiene una referencia a un
		 * objeto Circulo, para obtener una copia de este objeto Circulo
		 * tendremos que hacer un casteo <br>
		 * <br>
		 * NOTA: Si se estuviera trabajando con una versi�n anterior a Java 5,
		 * la sobrescritura del m�todo getNewFigura() ser�a as� <br>
		 * <br>
		 * 
		 * @Override public Figura getNewFigura() {<br>
		 * <br>
		 *           return new Circulo(radio, getColor()); <br>
		 *           }<br>
		 **/

		// Circulo cir = new Circulo(0, null);
		// Circulo cir2 = (Circulo) cir.getNewFigura();

		/**
		 * As�, con el RETORNO DE TIPO COVARIANTE a partir de java 5, se elimina
		 * el casteo.
		 */
		Circulo cir = new Circulo(0, null);
		Circulo cir2 = cir.getNewFigura();
	}
}
