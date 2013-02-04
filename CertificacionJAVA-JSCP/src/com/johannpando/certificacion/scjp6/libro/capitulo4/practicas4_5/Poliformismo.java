package com.johannpando.certificacion.scjp6.libro.capitulo4.practicas4_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.johannpando.certificacion.scjp6.libro.capitulo4.poo.Circulo;
import com.johannpando.certificacion.scjp6.libro.capitulo4.poo.Figura;
import com.johannpando.certificacion.scjp6.libro.capitulo4.poo.Rectangulo;
import com.johannpando.certificacion.scjp6.libro.capitulo4.poo.Triangulo;

public class Poliformismo {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		float base, altura, radio;
		int op;
		String color;

		do {

			System.out.println("1.- Crear Triángulo");
			System.out.println("2.- Crear Círculo");
			System.out.println("3.- Crear Rectángulo");
			System.out.println("4.- Salir");

			op = Integer.parseInt(bf.readLine());

			// NO HE TENIDO EN CUENTA QUE EL OBJETIVO ES REUTILIZAR CÓDIGO

			switch (op) {
			// case 1:
			// System.out.println("Introduzca la base:");
			// base = Integer.valueOf(bf.readLine());
			// System.out.println("Introduzca la altura");
			// altura = Integer.valueOf(bf.readLine());
			// System.out.println("Introduzca el color");
			// color = bf.readLine();
			// f = new Triangulo(base, altura, color);
			// System.out.println("El area del triángulo es " + f.area()
			// + ", el color es " + f.getColor());
			// break;
			// case 2:
			// System.out.println("Introduzca la radio:");
			// radio = Integer.valueOf(bf.readLine());
			// System.out.println("Introduzca el color");
			// color = bf.readLine();
			// f = new Circulo(radio, color);
			// System.out.println("El area del triángulo es " + f.area()
			// + ", el color es " + f.getColor());
			// break;
			// case 3:
			// System.out.println("Introduzca la base:");
			// base = Integer.valueOf(bf.readLine());
			// System.out.println("Introduzca la altura");
			// altura = Integer.valueOf(bf.readLine());
			// System.out.println("Introduzca el color");
			// color = bf.readLine();
			// f = new Rectangulo(base, altura, color);
			// System.out.println("El area del triángulo es " + f.area()
			// + ", el color es " + f.getColor());
			// break;

			case 1:
				System.out.println("Introduzca la base:");
				base = Integer.valueOf(bf.readLine());
				System.out.println("Introduzca la altura");
				altura = Integer.valueOf(bf.readLine());
				System.out.println("Introduzca el color");
				color = bf.readLine();
				// Invoca al método con un Triángulo
				pinta(new Triangulo(base, altura, color));
				break;
			case 2:
				System.out.println("Introduzca el radio:");
				radio = Integer.valueOf(bf.readLine());
				System.out.println("Introduzca el color");
				color = bf.readLine();
				// Invoca al método con un Círculo
				pinta(new Circulo(radio, color));
				break;
			case 3:
				System.out.println("Introduzca la base:");
				base = Integer.valueOf(bf.readLine());
				System.out.println("Introduzca la altura");
				altura = Integer.valueOf(bf.readLine());
				System.out.println("Introduzca el color");
				color = bf.readLine();
				// Invoca al método con un Rectángulo
				pinta(new Rectangulo(altura, base, color));
				break;

			}

		} while (op != 4);

	}

	/**
	 * Método que utiliza el poliformismo para mostrar los cálculos de todas las
	 * figuras
	 * 
	 * @param f
	 */
	public static void pinta(Figura f) {
		// Invoca a la versión de los métodos implementados en la subclase de
		// Figura pasada como parámetro
		System.out.println("Área: " + f.area());
		System.out.println("Color: " + f.getColor());
	}
}
