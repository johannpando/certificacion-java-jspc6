package com.johannpando.certificacion.scjp6.libro.capitulo4.poo.atributosMetodosProtected;

import com.johannpando.certificacion.scjp6.libro.capitulo4.poo.Persona;

public class Empleado extends Persona {

	// public Empleado(String f) {
	// super(f);
	// // TODO Auto-generated constructor stub
	// }

	public Empleado(String fecha) {
		super(fecha);
	}

	void muestraDatos() {
		// Acceso al método protegido
		System.out.println("Edad: " + this.getEdad());

		Persona persona = new Persona("fecha");
		// Las sublclases acceden a los miembros protegidos a través de la
		// herencia, no pudiendo utlizar una referencia a un objeto de la
		// superclase para acceder al miembro protegido.
		// persona.getEdad();// ERROR
	}
}
