package com.johannpando.certificacion.scjp6.dia.clasesanidadas.clasesInternasEstandares.claseInternaDentroDeMetodo;

public class Externa {

	class Interna {
		void muestra() {
			System.out.println("Clase Interna, método muestra.");
		}
	}

	void claseInternaDentroDeMetodo() {
		Interna interna = new Interna();
		interna.muestra();
	}

}
