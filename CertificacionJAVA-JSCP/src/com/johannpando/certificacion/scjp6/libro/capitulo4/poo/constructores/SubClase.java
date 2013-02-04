package com.johannpando.certificacion.scjp6.libro.capitulo4.poo.constructores;

/**
 * La llamada al constructor de la superclase debe ser la primera línea de
 * código del constructor de la subclase -- SIEMPRE QUE NO EXISTA EL CONSTRUCTOR
 * POR DEFECTO EN LA SUPERCLASE IMPLICITAMENTE.
 * 
 * @author jpandode
 * 
 */
public class SubClase extends SuperClase {

	private String atributoSubClase1;

	/**
	 * Constructor por defecto de la SubClase.
	 * 
	 * Como no existe el constructor por defecto en la superclase (lo he
	 * comentado), debemos de, explicitamente hacer el llamado al constructor
	 * con parámetros de la superclase.
	 */
	public SubClase() {
		// El compilador añade implícitamente -- super(); -- pero como no existe
		// el constructor por defecto en la superclase (comentado) hay que
		// llamar a uno de los constructores de la superclase, explícitamente
		super("atributo1");
		System.out.println("subclase");
		atributoSubClase1 = "atributoSubClase1";
	}

	public SubClase(String atributoSubClase1) {
		// El compilador añade implícitamente -- super(); -- pero como no existe
		// el constructor por defecto en la superclase (comentado) hay que
		// llamar a uno de los constructores de la superclase, explícitamente
		super("atributo1", "atributo2");
		this.atributoSubClase1 = atributoSubClase1;
	}

	/**
	 * Otra posibilidad es que, en vez de incluir una llamada al constructor de
	 * la superclase, se desee invocar a otro de los contrucores de su clase. En
	 * este caso, se utilizará la palabra reservada "this" en vez de super,
	 * siendo el constructor invocado el que incluirá la llamada al constructor
	 * de la superclase.
	 * 
	 * @param atributo
	 */
	public SubClase(int atributo) {
		this("atributo");
	}

	/**
	 * @return the atributoSubClase1
	 */
	public String getAtributoSubClase1() {
		return atributoSubClase1;
	}

	/**
	 * @param atributoSubClase1
	 *            the atributoSubClase1 to set
	 */
	public void setAtributoSubClase1(String atributoSubClase1) {
		this.atributoSubClase1 = atributoSubClase1;
	}
}
