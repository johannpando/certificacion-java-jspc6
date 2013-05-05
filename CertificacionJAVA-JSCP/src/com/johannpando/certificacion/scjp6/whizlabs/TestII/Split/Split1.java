package com.johannpando.certificacion.scjp6.whizlabs.TestII.Split;

import java.util.Arrays;

/**
 * El método de la clase String split () divide una cadena en torno a los
 * partidos de la expresión regular dada. El valor devuelto es una matriz de
 * String que contiene las fichas. En este caso partimos de la expresión "\ \ s"
 * y las fichas se almacenan en la matriz s.
 * 
 * La expresión "\ \
 * s" coincide con los espacios en blanco y por lo tanto los símbolos son "
 * Ella", "vende", "mar", "cáscaras". Así opciones D y E son correctos.
 * 
 * Este código se compila y se ejecuta sin errores, así que las opciones A y B
 * son también correctos.
 * 
 * public String [] Split (String regex): Divide la cadena en torno a los
 * partidos de la expresión regular dada. Este método es el mismo que si se
 * invocó el método split de dos argumentos con la expresión dada y un argumento
 * límite de cero. Trailing cadenas vacías no están incluidas en la matriz
 * resultante. ¿Quieres saber más?
 * 
 * @author Johann
 * 
 */
public class Split1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "She sells sea shells";
		System.out.println(Arrays.toString(str.split("\\s")));
	}

}
