package com.johannpando.certificacion.scjp6.libro.capitulo4.poo.herenciaYTiposGenericos;

import java.util.ArrayList;

import com.johannpando.certificacion.scjp6.libro.capitulo4.poo.Figura;

/**
 * Herencia y tipos genéricos. <br>
 * <br>
 * <li><strong>El hecho de que Integer sea una subclase de Object no implica que
 * un ArrayList de Integer sea un subtipo de de aun ArrayList de Object</strong>
 * </li> <br>
 * <li>El símbolo comodín <code>?</code> representa cualquier tipo de objeto.</li>
 * <li>Se puede utilizar el comodín conjuntamente con la palabra
 * <code>extends</code> para limitar el rango de objetos admitidos a un
 * determinado subtipo.</li> <li>Se utiliza para realizar operaciones de
 * recuperación de la información almacenada en ella, pero no para añadir nuevos
 * elementos a la misma.</li><br>
 * <br>
 * 
 * @author jpandode
 * 
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Object> objs;
		// Type mismatch: cannot convert from ArrayList<Integer> to
		// ArrayList<Object>
		// objs = new ArrayList<Integer>();

		Integer integer = 0;
		Object objeto = null;

		// Type mismatch: cannot convert from Object to Integer
		// integer = objeto;

		// The method imprimir(ArrayList<Object>) in the type Principal is not
		// applicable for the arguments (ArrayList<Integer>)
		// imprimir(new ArrayList<Integer>());

		// The method imprimir(ArrayList<Object>) in the type Principal is not
		// applicable for the arguments (ArrayList<String>)
		// imprimir(new ArrayList<String>());

		// Solución al problema anterior de la versión 5 de java
		// COMODINES
		imprimirComodin(new ArrayList<Integer>());
		imprimirComodin(new ArrayList<String>());

	}

	public static void imprimir(ArrayList<Object> objs) {
		for (Object object : objs) {
			System.out.println(object.toString());
		}
	}

	/**
	 * El símbolo comodín <code>?</code> representa cualquier tipo de objeto.
	 * 
	 * @param objs
	 */
	public static void imprimirComodin(ArrayList<?> objs) {
		for (Object object : objs) {
			System.out.println(object.toString());
		}
	}

	/**
	 * Limitamos el parámetro (comodín), a todas aquellas colecciones cuyos
	 * objetos sean subclases de Figura.
	 * 
	 * @param figuras
	 */
	public void imprimeAreaFiguras(ArrayList<? extends Figura> figuras) {
		// Se utiliza para realizar operaciones de recuperación de la
		// información almacenada en ella, pero no para añadir nuevos
		// elementos a la misma.
		// figuras.add(new Circulo(0, null));
		for (Figura figura : figuras) {
			System.out.println("Área: " + figura.area());
		}
	}

}
