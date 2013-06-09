package com.johannpando.certificacion.scjp6.whizlabs.TestIII.DeclaracionArray;

class SuperBase {

}

class Base extends SuperBase {
}

class Derived extends Base {
}

/**
 * This is a tricky question, here the problem is with the array creation
 * syntax.
 * 
 * When we use this syntax to create arrays, we should not specify the size, the
 * size is evaluated from the number of elements between the curly braces. Here
 * the declaration should be changed to new Derived[]{new Derived()}.
 * 
 * Other than this there are no errors in this program. A derived class array
 * can be assigned to a base class array. So all the other assignments are
 * valid. It is legal to make an array of size 0 also.
 * 
 * @author Johann
 * 
 */
public class DeclaracionArray1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SuperBase[] s1 = new Base[2];// 1
		// SuperBase[] s2 = new Derived[1] { new Derived() };//2
		SuperBase[] s2 = new Derived[1];
		Base[] b1 = new Derived[0];
		Derived[] d1 = (Derived[]) s2;// 4
		Base[] b3 = d1;// 5
		s1 = b1;// 6
	}

}
