package com.johannpando.certificacion.scjp6.libro.capitulo4.poo.abstracto;

import com.johannpando.certificacion.scjp6.libro.capitulo4.poo.Figura;

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
	 * Implementación del método abstracto Figura.area. Al implementarla,
	 * desaparece la palabra abstract
	 */
	@Override
	public float area() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Sobrecarga del método
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
