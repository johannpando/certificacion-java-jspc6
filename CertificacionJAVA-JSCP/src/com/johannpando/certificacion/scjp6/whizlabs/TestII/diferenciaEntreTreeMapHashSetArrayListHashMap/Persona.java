package com.johannpando.certificacion.scjp6.whizlabs.TestII.diferenciaEntreTreeMapHashSetArrayListHashMap;

public class Persona {

	private String dni;

	private String apellido;

	private String nombre;

	public Persona(String dni, String apellido, String nombre) {
		super();
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
