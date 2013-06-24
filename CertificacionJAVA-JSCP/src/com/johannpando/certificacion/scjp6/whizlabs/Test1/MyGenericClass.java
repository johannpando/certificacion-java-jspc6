package com.johannpando.certificacion.scjp6.whizlabs.Test1;

/**
 * Ninguno de ellos se compilará porque ningún miembro estático puede utilizar
 * un parámetro de tipo declarado de la clase que lo contiene. Sin embargo, los
 * métodos genéricos estáticos se pueden utilizar, que definen sus propios
 * parámetros de tipo.
 * 
 * @author Johann
 * 
 * @param <T>
 */
public class MyGenericClass<T> {

	// Cannot make a static reference to the non-static type T
	// static T object1;
}
