package com.johannpando.certificacion.scjp6.libro.capitulo4.poo;

public class Persona {

	private String fecha_nacimiento;

	public Persona(String f) {
		fecha_nacimiento = f;
	}

	protected int getEdad() {
		return 15;
	}

}
