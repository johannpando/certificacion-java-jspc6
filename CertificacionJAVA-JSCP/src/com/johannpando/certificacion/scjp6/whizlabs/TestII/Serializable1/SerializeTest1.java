package com.johannpando.certificacion.scjp6.whizlabs.TestII.Serializable1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test implements Serializable {
}

class SerializeTest1 {
	public static void main(String[] args) {
		try {
			Test t = new Test();
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream("Test"));
			out.writeObject(t);
			out.close();
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(
					"Test"));
			// Error de compilación: No puedo convertir de Object a Test
			// Test newt = in.readObject();
			Test newt = (Test) in.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}