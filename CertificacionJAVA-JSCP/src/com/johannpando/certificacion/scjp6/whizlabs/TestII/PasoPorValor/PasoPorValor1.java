package com.johannpando.certificacion.scjp6.whizlabs.TestII.PasoPorValor;

/**
 * <p>
 * In Java, method arguments are passed by value. When the g() method is called,
 * the argument b receives a copy of the instance variable b. Since the copy
 * alone is modified, the change of value in parameter b is confined to the g()
 * method. So b's value remains 0. However, the change made to the instance
 * variable a is reflected, since there is only copy of a. So the value of a
 * becomes 1. When an object reference is passed to a method, the copy of the
 * object reference is received as the method argument.
 * 
 * Now the copy also refers to the original object itself. Since arrays are
 * objects, the changes made within the g() method affect the original array
 * object, so the value of the first element changes to 1. Thus the values of a,
 * b, and c[0] are printed as 1, 0, and 1 respectively.
 * 
 * Hence, choice E is correct and the other choices are automatically incorrect.
 * </p>
 * En Java, los argumentos de método se pasan por valor. Cuando se llama al
 * método g (), el argumento b recibe una copia de la variable de instancia b.
 * Puesto que se modifica la copia solo, el cambio de valor en el parámetro b se
 * limita al método g (). Por lo tanto el valor de b se mantiene en 0. Sin
 * embargo, el cambio realizado en la variable de instancia a es reflejada,
 * puesto que sólo hay una copia de a. Por lo tanto el valor de una se convierte
 * en 1. Cuando se pasa una referencia de objeto a un método, se recibe la copia
 * de la referencia como el argumento del método.
 * 
 * Ahora la copia también se refiere a la propia objeto original. Dado que las
 * matrices son objetos, los cambios realizados en el) el método g (afectan el
 * objeto matriz original, por lo que el valor de los primeros cambios elemento
 * a 1. Por lo tanto los valores de a, b, y c [0] son mostrados como 1, 0, y 1,
 * respectivamente.
 * 
 * Por lo tanto, la opción E es correcta y las otras opciones son
 * automáticamente incorrecta.
 * 
 * @author Johann
 * 
 */
public class PasoPorValor1 {

	int a;
	int b;

	public void f() {
		a = 0;
		b = 0;
		int[] c = { 0 };
		g(b, c);
		System.out.println(a + " " + b + " " + c[0] + " ");
	}

	public void g(int b, int[] c) {
		a = 1;
		b = 1;
		c[0] = 1;
	}

	public static void main(String[] args) {
		PasoPorValor1 obj = new PasoPorValor1();
		obj.f();
	}

}
