package com.johannpando.certificacion.scjp6.dia.clasesanidadas.clasesInternasEstandares;

class Externa {
	String s = "m�o";
	//Una clase interna tiene acceso a los miembros de la clase externa.
	class Interna{
		public void muestra(){
			System.out.println("objeto interno " + s);
		}
	}
}
