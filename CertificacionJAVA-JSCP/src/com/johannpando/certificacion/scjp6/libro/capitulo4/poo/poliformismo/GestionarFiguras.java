package com.johannpando.certificacion.scjp6.libro.capitulo4.poo.poliformismo;

import com.johannpando.certificacion.scjp6.libro.capitulo4.poo.Circulo;
import com.johannpando.certificacion.scjp6.libro.capitulo4.poo.Figura;
import com.johannpando.certificacion.scjp6.libro.capitulo4.poo.Rectangulo;
import com.johannpando.certificacion.scjp6.libro.capitulo4.poo.Triangulo;

public class GestionarFiguras {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// **********Triangulo
		mostrar(new Triangulo(5, 7, "verde"));

		// **********Circulo
		mostrar(new Circulo(4, "azul"));

		// ***********Rectangulo
		mostrar(new Rectangulo(3, 2, "naranja"));
	}

	private static void mostrar(Figura figura) {
		// Se pueden utilizar con cualquier subclase de Figura
		System.out.println("El color de la figura es " + figura.getColor());
		System.out.println("El área de la figura es " + figura.area());

	}

}
