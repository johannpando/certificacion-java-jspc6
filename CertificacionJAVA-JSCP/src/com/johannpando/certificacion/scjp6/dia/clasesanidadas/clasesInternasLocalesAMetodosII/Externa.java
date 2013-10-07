package com.johannpando.certificacion.scjp6.dia.clasesanidadas.clasesInternasLocalesAMetodosII;

public class Externa {

	void externa() {
		// Esto da fallos de compilación pues la clase Interna aún no se ha
		// declarado.
		// Interna claseInterna = new Interna();
		// claseInterna.metodoClaseInterna();

		class Interna {
			public void metodoClaseInterna() {
				System.out
						.println("Método 'metodoClaseInterna' dentro de clase Interna y a su vez dentro de clase Externa.");

			}
		}

		// La instanciación de la clase se realiza después de haberla declarado.
		Interna claseInterna = new Interna();
		claseInterna.metodoClaseInterna();

	}
}
