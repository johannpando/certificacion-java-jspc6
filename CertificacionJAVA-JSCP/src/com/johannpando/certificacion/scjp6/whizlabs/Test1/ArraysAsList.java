package com.johannpando.certificacion.scjp6.whizlabs.Test1;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * The Arrays.asList method returns a fixed-size list backed by the specified
 * array. This method acts as bridge between array-based and collection-based
 * APIs, in combination with Collections.toArray().
 * </p>
 * <p>
 * El método Arrays.asList devuelve una lista de tamaño fijo apoyado por la
 * matriz especificada. Este método actúa como puente entre las API de array y
 * los basados ​​en la colección-, en combinación con Collections.toArray ().
 * </p>
 * 
 * @author Johann
 * 
 */
public class ArraysAsList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer a[] = { 3, 6, 7, 4 };

		List<Integer> lista = Arrays.asList(a);

		for (Integer integer : lista) {
			System.out.println(integer);
		}

		// Exception in thread "main" java.lang.UnsupportedOperationException
		lista.add(1555);

		for (Integer integer : lista) {
			System.out.println(integer);
		}
	}

}
