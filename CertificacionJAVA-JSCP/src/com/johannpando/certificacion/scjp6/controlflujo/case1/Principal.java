package com.johannpando.certificacion.scjp6.controlflujo.case1;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final int b;
		b = 4;
		int c = 6;
		switch (3) {
		/*
		 * case b:// case expressions must be constant expressions // El valor
		 * evaluado por el case, en nuestro caso 'b', tiene que // se una
		 * constante que se pueda resolver en tiempo de // ejecución. // final
		 * int b; // b = 4; // Lo correcto debe ser inicializarlo en una sola
		 * línea, final // int b = 4;
		 */
		case 5:
			// case c:// ERROR, debe ser una constante.
			// case 4654654561231456:// The literal 4654654561231456 of type int
			// is out
			// of range, el tipo de dato evaluado (switch(3)
			// un int excede el número)
		}
	}

}
