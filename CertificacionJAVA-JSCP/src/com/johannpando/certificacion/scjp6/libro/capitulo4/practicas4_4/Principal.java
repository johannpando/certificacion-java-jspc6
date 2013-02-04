package com.johannpando.certificacion.scjp6.libro.capitulo4.practicas4_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String args[]) throws NumberFormatException,
			IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int op;

		CuentaClave cuentaClave = null;

		float dinero;

		do {
			System.out.println("1.- Crear cuenta vac�a");
			System.out.println("2.- Crear cuenta saldo inicial");
			System.out.println("3.- Ingresar dinero");
			System.out.println("4.- Sacar dinero");
			System.out.println("5.- Ver saldo");
			System.out.println("6.- Salir");
			op = Integer.parseInt(bf.readLine());
			switch (op) {
			case 1:
				cuentaClave = new CuentaClave();
				System.out.println("Debe asociar una clave:");
				cuentaClave.setClave(bf.readLine());
				System.out.println("Cuenta creada y clave asociada");
				break;
			case 2:
				System.out.println("Introduzca saldo inicial");
				float saldoInicial = Float.valueOf(bf.readLine());
				cuentaClave = new CuentaClave(saldoInicial);
				System.out.println("Debe asociar una clave:");
				cuentaClave.setClave(bf.readLine());
				break;
			case 3:
				System.out.println("Introduzca la cantidad a ingresar");
				dinero = Float.valueOf(bf.readLine());
				try {
					// OJO -- El m�todo ingresar de la clase
					// com.johannpando.ceretificacion.scjp6.libro.practicas4_2.Cuenta
					// ten�a el modificador default (s�lo visible desde el mismo
					// paquete), da igual que haya heredado dicha clase desde
					// CuentaClave, no es visible, as� que se cambia el m�todo
					// (y los otros) a public
					cuentaClave.ingresar(dinero);
				} catch (NullPointerException e) {
					System.out
							.println("La cuenta a�n no ha sido creada, seleccione opci�n 1 � 2");
				}
				break;
			case 4:
				System.out.println("Introduzca la cantidad a retirar");
				dinero = Float.valueOf(bf.readLine());
				try {
					// Accedo al m�todo sobrescrito
					cuentaClave.extraer(dinero);
					// Pero y si quiero acceder al m�todo de la superclase?
					// Entonces para que lo sobrescribes????
					// Puedes hacer todo lo que hace el m�todo original y
					// aumentar la funcionalidad en el m�todo sobrescrito
				} catch (NullPointerException e) {
					System.out
							.println("La cuenta a�n no ha sido creada, seleccione opci�n 1 � 2");
				}
				break;
			case 5:
				try {
					System.out.println("Su saldo actual es: "
							+ cuentaClave.getSaldo());
				} catch (NullPointerException e) {
					System.out
							.println("La cuenta a�n no ha sido creada, seleccione opci�n 1 � 2");
				}
				break;
			}
		} while (op != 6);

	}
}
