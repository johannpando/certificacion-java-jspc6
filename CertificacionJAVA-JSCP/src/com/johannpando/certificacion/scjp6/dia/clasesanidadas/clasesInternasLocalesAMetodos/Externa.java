package com.johannpando.certificacion.scjp6.dia.clasesanidadas.clasesInternasLocalesAMetodos;

public class Externa {

	int atributoDeClasePrincipal = 0;

	/**
	 * M�todo declarado en la clase Principal (Externa) que contiene una clase
	 * (Interna) y que a su vez contiene un m�todo llamado metodoClaseInterna.
	 * La clase Interna declarada en el interior del m�todo s�lo podr� ser
	 * instanciada dentro del m�todo.<br>
	 * <br>
	 */
	void metodoClaseExterna() {

		int variableLocalMetodoClaseExterna = 0;

		/**
		 * Clase Interna.<br>
		 * <br>
		 * Una clase que est� definida dentro de un m�todo no puede acceder a
		 * las variables locales definidas en el m�todo a menos que sea final.<br>
		 * Dado que la clase est� definida dentro de un m�todo es un elemento
		 * local a �ste. �nicamente podr�n utilizarse en su definici�n los
		 * modificadores abstract y final.
		 * 
		 * @author jpandode
		 * 
		 */
		class Interna {
			/**
			 * M�todo de la clase Interna que a su vez est� dentro de un m�todo
			 * de una clase Externa.
			 */
			void metodoClaseInterna() {
				System.out.println("Local al m�todo");
				// Error de compilaci�n al intentar acceder a una variable local
				// desde �sta clase.
				// variableLocalMetodoClaseExterna++;

				// No se puede acceder a una variable local del m�todo pero si a
				// un atributo de la clase Principal.
				Externa.this.atributoDeClasePrincipal++;
			}

		}

		// La clase Interna s�lo se podr� instanciar desde dentro del m�todo.
		Interna in = new Interna();
		in.metodoClaseInterna();
	}

}
