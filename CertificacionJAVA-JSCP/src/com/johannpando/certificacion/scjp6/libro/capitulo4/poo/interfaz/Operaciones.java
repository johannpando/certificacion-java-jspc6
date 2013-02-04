package com.johannpando.certificacion.scjp6.libro.capitulo4.poo.interfaz;

/**
 * Consideraciones:<br>
 * <li>Todos los m�todos definidos en una interfaz son p�blicos y abstractos
 * aunque no se indique expl�citamente.</li> <li>En una interfaz es posible
 * definir constantes, son impl�citamente p�blicas y est�ticas.</li> <li>Una
 * interface no es una clase. No pueden haber m�todos con c�digo, constructores
 * o variables.</li><br>
 * <br>
 * 
 * @author jpandode
 * 
 */
public interface Operaciones {

	// En una interfaz es posible definir constantes, son impl�citamente
	// p�blicas y est�ticas.

	int k = 32;

	// Todos los m�todos definidos en una interfaz son p�blicos y abstractos
	// aunque no se indique expl�citamente.
	void rotar();

	// Todos los m�todos definidos en una interfaz son p�blicos y abstractos
	// aunque no se indique expl�citamente.
	void serializar();
}
