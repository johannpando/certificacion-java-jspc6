package com.johannpando.certificacion.scjp6.libro.capitulo9.multitarea.practicas9_1;

public class Consumidor extends Thread {

	Buffer bf;
	JVentana jv;

	public Consumidor(Buffer bf, JVentana jv) {
		this.bf = bf;
		this.jv = jv;
	}

	public void run() {
		// Recupera cadenas mientras no se hayan obtenido todas
		while (jv.dmconsumidas.size() <= JVentana.TOTAL_CADENAS) {
			synchronized (bf) {
				// Extrae cadenas del buffer si no está vacío.
				if (!bf.isEmpty()) {
					jv.dmconsumidas.addElement(bf.extraer());
					// Notifica al proceso en espera que ya puede utilizar el
					// buffer.
					bf.notify();
				}
			}
			// Se pone a dormir más tiempo que el productor para simular una
			// velocidad de procesamiento inferior a éste.
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
