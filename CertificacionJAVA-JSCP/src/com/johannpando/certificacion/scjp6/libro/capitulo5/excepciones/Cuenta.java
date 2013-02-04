package com.johannpando.certificacion.scjp6.libro.capitulo5.excepciones;

public class Cuenta {

	private double saldo;

	public Cuenta() {
		this.saldo = 50;
	}

	public void extraer(double s)
			throws ExcepcionPersonalizadaCantidadInsuficiente {
		if (s <= saldo) {
			s -= saldo;
		} else {
			throw new ExcepcionPersonalizadaCantidadInsuficiente(
					"saldo negativo");
		}
	}

	public double getSaldo() {
		return saldo;
	}

}
