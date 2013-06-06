package com.johannpando.certificacion.scjp6.whizlabs.TestIII.Vector;

import java.util.Vector;

public class Vector1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Vector v = new Vector<Integer>();

		v.add(8);

		for (Object o : v) {
			System.out.println(((Integer) o).intValue());
		}
	}

}
