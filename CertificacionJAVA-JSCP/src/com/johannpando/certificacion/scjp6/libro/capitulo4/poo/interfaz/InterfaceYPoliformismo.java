package com.johannpando.certificacion.scjp6.libro.capitulo4.poo.interfaz;

/**
 * Una variable de tipo interfaz puede almacenar cualquier objeto de las clases
 * que implementan.<br>
 * En este ejemplo, La interface <code>Operaciones</code>
 * 
 * @author jpandode
 * 
 */
public class InterfaceYPoliformismo {

	/**
	 * En este ejemplo, tenemos una variable de tipo interfaz
	 * <code>Operaciones</code> llamada "op", a la que se le asigna un objeto de
	 * la clase que implementa, es decir la clase
	 * <code>com.johannpando.certificacion.scjp6.libro.poo.interfaz.Triangulo</code>
	 * implementa <code>Operaciones</code>, por lo tanto, la variable op, puede
	 * llamar a los métodos implementados de la clase
	 * <code>com.johannpando.certificacion.scjp6.libro.poo.interfaz.Triangulo</code>
	 * .
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Operaciones.k);
		Operaciones op = new Triangulo(0, 0, null);
		op.rotar();
		op.serializar();
	}

}
