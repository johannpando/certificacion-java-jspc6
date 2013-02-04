package com.johannpando.certificacion.scjp6.libro.capitulo6.accesoAlDisco;

import java.io.Serializable;

/**
 * <strong>Serialización de objetos.</strong> <br>
 * Para que un objeto pueda ser almacenado en disco, es necesario que la clase a
 * la que pertenece sea <strong>serializable</strong>. Esta característica la
 * poseen todas aquellas clase que implementan la interfaz
 * <strong>java.io.Serializable</strong>.<br>
 * <br>
 * La interfaz Serializable no contiene ningún método, basta con que una clase
 * la implemente para que sus objetos puedan ser serializados por la máquina
 * virtual y por tanto almacenados en disco. <br>
 * <br>
 * Si no se Serializa origina el siguiente error:<br>
 * Exception in thread "main" java.io.NotSerializableException:
 * com.johannpando.certificacion
 * .scjp6.libro.capitulo6.accesoAlDisco.EscrituraObjetosEnUnFicheroPersona
 * 
 * @author jpandode
 * 
 */
public class EscrituraObjetosEnUnFicheroPersona implements Serializable {

	private String name;
	private int edad;

	public EscrituraObjetosEnUnFicheroPersona(String name, int edad) {
		this.name = name;
		this.edad = edad;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad
	 *            the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
