package com.johannpando.certificacion.scjp6.libro.capitulo6.practicas6_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;

public class Principal {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException, ClassNotFoundException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// Variable que contendrá la opción ingresada por el usuario
		int op;
		// Variables d, n, t, que representan a dni, nombre y teléfono,
		// respectivamente.
		String d, n, t;
		Agenda ag = new Agenda();
		do {
			System.out.println("1.- Agregar Personas");
			System.out.println("2.- Buscar Persona");
			System.out.println("3.- Eliminar Persona");
			System.out.println("4.- Mostrar Personas");
			System.out.println("5.- Salir");
			op = Integer.parseInt(bf.readLine());

			switch (op) {
			// Añadir persona
			case 1:
				System.out.println("Introduzca dni:");
				d = bf.readLine();
				System.out.println("Introduzca nombre");
				n = bf.readLine();
				System.out.println("Introduzca teléfono");
				t = bf.readLine();
				if (ag.agregar(n, d, t)) {
					System.out.println("Persona añadida correctamente");
				} else {
					System.out.println("La persona con dni: '" + d
							+ "' ya existe. No se ha podido añadir.");
				}
				break;
			case 2:
				System.out.println("Introduzca el dni a buscar:");
				d = bf.readLine();
				Persona p = ag.recuperar(d);
				if (p != null) {
					System.out
							.println("Persona encontrada, sus datos son los siguientes:");
					System.out.println("Nombre: " + p.getNombre());
					System.out.println("Teléfono: " + p.getTelefono());
					System.out.println("DNI: " + p.getDni());
				} else {
					System.out.println("Persona no encontrada.");
				}
				break;
			case 3:
				System.out
						.println("Introduzca el dni de la persona a eliminar");
				d = bf.readLine();
				if (ag.eliminar(d)) {
					System.out
							.println("Se ha eliminado a la persona correctamente");
				} else {
					System.out
							.println("No se ha encontrado a ninguna persona con el dni proporcionado. No se ha podido eliminar");
				}
				break;
			case 4:
				System.out.println("Mostrando a todas las personas");
				Enumeration<String> personas = ag.total();
				int contador = 0;
				while (personas.hasMoreElements()) {
					contador++;
					// Recuperamos el dni uno a uno
					d = personas.nextElement();
					Persona pt = ag.recuperar(d);
					System.out.println("***** Persona número " + contador
							+ " *****");
					System.out.println("Nombre: " + pt.getNombre());
					System.out.println("Teléfono: " + pt.getTelefono());
					System.out.println("DNI: " + pt.getDni());
				}
				if (contador == 0) {
					System.out.println("No hay personas");
				}
				break;
			case 5:
				ag.guardar();
				break;
			}
		} while (op != 5);
	}

}
