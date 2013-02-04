package com.johannpando.certificacion.scjp6.libro.capitulo4.practicas4_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Me he demorado en realizar todo, 32:30 minutos.

public class Principal {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int op;

		Cuenta cuenta = null;

		float dinero;

		do {
			System.out.println("1.- Crear cuenta vacía");
			System.out.println("2.- Crear cuenta saldo inicial");
			System.out.println("3.- Ingresar dinero");
			System.out.println("4.- Sacar dinero");
			System.out.println("5.- Ver saldo");
			System.out.println("6.- Salir");
			op = Integer.parseInt(bf.readLine());
			switch (op) {
			case 1:
				cuenta = new Cuenta();
				System.out.println("Cuenta creada");
				break;
			case 2:
				System.out.println("introduzca saldo inicial");
				float saldoInicial = Float.valueOf(bf.readLine());
				cuenta = new Cuenta(saldoInicial);
				break;
			case 3:
				System.out.println("Introduzca la cantidad a ingresar");
				dinero = Float.valueOf(bf.readLine());
				try {
					cuenta.ingresar(dinero);
				} catch (NullPointerException e) {
					System.out
							.println("La cuenta aún no ha sido creada, seleccione opción 1 ó 2");
				}
				break;
			case 4:
				System.out.println("Introduzca la cantidad a retirar");
				dinero = Float.valueOf(bf.readLine());
				try {
					cuenta.extraer(dinero);
				} catch (NullPointerException e) {
					System.out
							.println("La cuenta aún no ha sido creada, seleccione opción 1 ó 2");
				}
				break;
			case 5:
				try {
					System.out.println("Su saldo actual es: "
							+ cuenta.getSaldo());
				} catch (NullPointerException e) {
					System.out
							.println("La cuenta aún no ha sido creada, seleccione opción 1 ó 2");
				}
				break;
			}
		} while (op != 6);

	}
}
