package com.johannpando.certificacion.scjp6.dia.clasesanidadas.clasesInternasEstandares.usoThis;

public class Externa {

	// ******** ATRIBUTOS ****************

	private final int numero0 = 1;

	// abstract int numero1 = 1;// Illegal modifier for the field numero1; only
	// public, protected, private, static, final,
	// transient & volatile are permitted.
	// strictfp int numero2; idem arriba.
	static int numero3;
	protected int numero4;
	public int numero5;

	// Esta clase no puede ser estática.
	class Interna {
		public void muestrain() {
			System.out.println("Objeto interno.");
		}

		public void imprime() {
			this.muestrain();
			Externa.this.muestraext();
		}
	}

	private boolean resultadoCorrecto;

	// ***************** MÉTODOS
	public void muestraext() {
		System.out.println("Objeto externo.");
	}

}
