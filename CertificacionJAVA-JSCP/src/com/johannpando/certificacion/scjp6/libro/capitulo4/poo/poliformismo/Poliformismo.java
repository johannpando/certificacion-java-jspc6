package com.johannpando.certificacion.scjp6.libro.capitulo4.poo.poliformismo;

import com.johannpando.certificacion.scjp6.libro.capitulo4.poo.Circulo;
import com.johannpando.certificacion.scjp6.libro.capitulo4.poo.Figura;
import com.johannpando.certificacion.scjp6.libro.capitulo4.poo.Rectangulo;
import com.johannpando.certificacion.scjp6.libro.capitulo4.poo.Triangulo;

/**
 * <h2>Asignaci&oacute;n de objetos a variables de su superclase</h2> Es posible
 * asignar un objeto de una clase a una variable de su superclase, incluso
 * cuando �sta es una clase abstracta.<br>
 * <br>
 * 
 * @author jpandode
 * 
 */
public class Poliformismo {

	// Es posible asignar un objeto de una clase a una variable de su
	// superclase, incluso cuando �sta es una clase abstracta.
	public void asignacionDeObjetosAVariablesDeSuSuperClase() {
		// Dada una variable de tipo Figura
		Figura f;
		// Es posible asignar a esta variable un objeto Tri�ngulo.
		f = new Triangulo(0, 0, null);

		// A partir de aqu� puede utilizarse esta variable para invocar a
		// aquellos m�todos del objeto que tambi�n est�n definidos o declarados
		// en la superclase, pero no aquellos que s�lo existan en la clase a la
		// que pertenece el objeto.

		f.getColor(); // accede al m�todo getColor de la clase Triangulo (pero
						// que hereda de la clase Figura)
		f.area();// accede al m�todo getColor de la clase Triangulo (pero que
					// hereda de la clase Figura)

		// f.getBase(); // ERROR de compilaci�n, m�todo que pertenece a
		// Triangulo
		// f.getAltura(); // ERROR de compilaci�n, m�todo que pertenece a
		// Triangulo

		// -------------------------------------------------------------------
		// ---------------------- POLIFORMISMO -------------------------------
		// ----- La posibilidad de utilizar una misma expresi�n para ---------
		// ----- invocar a diferentes versiones de un mismo m�todo. ---------
		// -------------------------------------------------------------------

		Figura figura;
		figura = new Triangulo(0, 0, null);
		figura.area();

		figura = new Circulo(0, null);
		figura.area();

		figura = new Rectangulo(0, 0, null);
		figura.area();
	}
}
