package com.johannpando.certificacion.scjp6.libro.capitulo4.poo.interfaz;

/**
 * Consideraciones:<br>
 * <li>Todos los métodos definidos en una interfaz son públicos y abstractos
 * aunque no se indique explícitamente.</li> <li>En una interfaz es posible
 * definir constantes, son implícitamente públicas y estáticas.</li> <li>Una
 * interface no es una clase. No pueden haber métodos con código, constructores
 * o variables.</li><br>
 * <br>
 * 
 * @author jpandode
 * 
 */
public interface Operaciones {

	// En una interfaz es posible definir constantes, son implícitamente
	// públicas y estáticas.

	int k = 32;

	// Todos los métodos definidos en una interfaz son públicos y abstractos
	// aunque no se indique explícitamente.
	void rotar();

	// Todos los métodos definidos en una interfaz son públicos y abstractos
	// aunque no se indique explícitamente.
	void serializar();
}
