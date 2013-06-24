package com.johannpando.certificacion.scjp6.whizlabs.Test1;

import java.util.Vector;

class Shape3 {
}

class Circle3 extends Shape3 {
}

class Rectangle3 extends Shape3 {
}

class Generics15 {
	public static void main(String[] args) {
		Vector<Shape3> picture = new Vector<Shape3>(); // 1
		picture.add(new Circle3()); // 2
		picture.add(new Rectangle3()); // 3
		// Rectangle3 rect = picture.get(1); // 4 //Type mismatch: cannot
		// convert
		// from Shape3 to Rectangle3
		Rectangle3 rect = (Rectangle3) picture.get(1);
	}
}