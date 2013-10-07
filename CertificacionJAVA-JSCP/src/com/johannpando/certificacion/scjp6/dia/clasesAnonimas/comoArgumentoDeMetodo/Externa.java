package com.johannpando.certificacion.scjp6.dia.clasesAnonimas.comoArgumentoDeMetodo;

import com.johannpando.certificacion.scjp6.libro.capitulo4.poo.interfaz.Operaciones;

public class Externa {

	void proceso() {
		OtraClase o = new OtraClase();
		o.metodo(new Operaciones() {

			@Override
			public void serializar() {
				// TODO Auto-generated method stub

			}

			@Override
			public void rotar() {
				System.out.println("Imprime rotar?");

			}

		});

	}

}
