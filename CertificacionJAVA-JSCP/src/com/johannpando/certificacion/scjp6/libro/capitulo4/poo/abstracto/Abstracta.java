package com.johannpando.certificacion.scjp6.libro.capitulo4.poo.abstracto;

import com.johannpando.certificacion.scjp6.libro.capitulo4.poo.Figura;

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
public class Abstracta extends Figura {

	public Abstracta(String c) {
		super(c);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ERROR: No se puede instanciar una clase abstracta
		// Figura figura = new Figura();
	}

	/**
	 * Implementaci�n del m�todo abstracto Figura.area. Al implementarla,
	 * desaparece la palabra abstract
	 */
	@Override
	public float area() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Sobrecarga del m�todo
	 * 
	 * @param a
	 * @return
	 */
	public double area(double a) {
		return a;
	}

	@Override
	public Figura getNewFigura() {
		// TODO Auto-generated method stub
		return null;
	}

}
