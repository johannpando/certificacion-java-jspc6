package com.johannpando.certificacion.scjp6.libro.capitulo4.poo;

/**
 * Clase Abstracta.- Alguno de sus m�todos es abstracto.<br>
 * Consideraciones:<br>
 * <li>Una clase abstracta puede tener m�todos no abstractos</li> <li>No es
 * posible crear objetos de una clase abstracta</li> <li><strong>Las subclases
 * de una clase abstracta est�n obligadas a sobrescribir todos los m�todos
 * abstractos que heredan.</strong> Si no hay intenci�n de sobrescribir alg�n
 * m�todo, la subclase deber� ser declarada como abstracta.</li> <li>Cuando un
 * m�todo abstracto es sobrescrito por una subclase, la palabra abstract
 * desaparece de la defici�n del m�todo</li> <li>Una clase abstracta puede tener
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
	 * M�todo abstracto, cada clase que herede de esta SuperClase
	 * <code>com.johannpando.certificacion.scjp6.libro.poo.Figura</code>,
	 * deber&aacute; implementar este m�todo.
	 * 
	 * @return
	 */
	public abstract float area();

	/**
	 * M�todo abstracto: Devuelve un tipo
	 * <code>com.johannpando.certificacion.scjp6.libro.poo.Figura</code> y
	 * gracias a java 5 y los TIPOS DE RETORNOS COVARIANTES, el tipo de
	 * devoluci�n puede ser una subclase.
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
