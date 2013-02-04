package com.johannpando.certificacion.scjp6.libro.capitulo4.poo.sobreescritura;

public class Primera {

	public void imprimir(String mensaje) {
		System.out.println(mensaje);
	}

	protected void imprimeMensaje(String mensaje) {
		System.out.println("Desde superclase");
	}

	protected void imprimeMensajes() {

	}

}
