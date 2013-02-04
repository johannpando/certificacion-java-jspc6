package com.johannpando.certificacion.scjp6.libro.capitulo4.poo;

/**
 * Clase Abstracta.- Alguno de sus métodos es abstracto.<br>
 * Consideraciones:<br>
 * <li>Una clase abstracta puede tener métodos no abstractos</li> <li>No es
 * posible crear objetos de una clase abstracta</li> <li><strong>Las subclases
 * de una clase abstracta están obligadas a sobrescribir todos los métodos
 * abstractos que heredan.</strong> Si no hay intención de sobrescribir algún
 * método, la subclase deberá ser declarada como abstracta.</li> <li>Cuando un
 * método abstracto es sobrescrito por una subclase, la palabra abstract
 * desaparece de la defición del método</li> <li>Una clase abstracta puede tener
 * constructores</li>
 * 
 * @author jpandode
 * 
 */
public abstract class Figura {

	private String color;

	public Figura(String c) {
		color = c;
	}

	/***
	 * Método abstracto, cada clase que herede de esta SuperClase
	 * <code>com.johannpando.certificacion.scjp6.libro.poo.Figura</code>,
	 * deber&aacute; implementar este método.
	 * 
	 * @return
	 */
	public abstract float area();

	/**
	 * Método abstracto: Devuelve un tipo
	 * <code>com.johannpando.certificacion.scjp6.libro.poo.Figura</code> y
	 * gracias a java 5 y los TIPOS DE RETORNOS COVARIANTES, el tipo de
	 * devolución puede ser una subclase.
	 * 
	 * @return
	 */
	public abstract Figura getNewFigura();

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

}
