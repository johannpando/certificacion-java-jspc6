package com.johannpando.certificacion.scjp6.dia.clasesanidadas.clasesInternasLocalesAMetodos;

public class Externa {

	int atributoDeClasePrincipal = 0;

	/**
	 * Método declarado en la clase Principal (Externa) que contiene una clase
	 * (Interna) y que a su vez contiene un método llamado metodoClaseInterna.
	 * La clase Interna declarada en el interior del método sólo podrá ser
	 * instanciada dentro del método.<br>
	 * <br>
	 */
	void metodoClaseExterna() {

		int variableLocalMetodoClaseExterna = 0;

		/**
		 * Clase Interna.<br>
		 * <br>
		 * Una clase que está definida dentro de un método no puede acceder a
		 * las variables locales definidas en el método a menos que sea final.<br>
		 * Dado que la clase está definida dentro de un método es un elemento
		 * local a éste. únicamente podrán utilizarse en su definición los
		 * modificadores abstract y final.
		 * 
		 * @author jpandode
		 * 
		 */
		class Interna {
			/**
			 * Método de la clase Interna que a su vez está dentro de un método
			 * de una clase Externa.
			 */
			void metodoClaseInterna() {
				System.out.println("Local al método");
				// Error de compilación al intentar acceder a una variable local
				// desde ésta clase.
				// variableLocalMetodoClaseExterna++;

				// No se puede acceder a una variable local del método pero si a
				// un atributo de la clase Principal.
				Externa.this.atributoDeClasePrincipal++;
			}

		}

		// La clase Interna sólo se podrá instanciar desde dentro del método.
		Interna in = new Interna();
		in.metodoClaseInterna();
	}

}
