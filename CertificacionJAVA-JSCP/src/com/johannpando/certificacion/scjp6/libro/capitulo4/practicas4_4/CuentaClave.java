package com.johannpando.certificacion.scjp6.libro.capitulo4.practicas4_4;

import com.johannpando.certificacion.scjp6.libro.capitulo4.practicas4_2.Cuenta;

public class CuentaClave extends Cuenta {

	private String clave;

	public CuentaClave() {
		super();
	}

	public CuentaClave(float c) {
		super(c);
	}

	@Override
	public void extraer(float c) {

		if (c <= this.getSaldo()) {
			this.setSaldo(c - this.getSaldo());
		}
	}

	/**
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * @param clave
	 *            the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}
}
