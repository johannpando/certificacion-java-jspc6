package com.johannpando.certificacion.scjp6.libro.capitulo6.accesoAlDisco;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ClaseFileReader {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws IOException {
		File file = new File(
				"C:/ejemplos/WORKSPACE/CertificacionJAVA-JSCP/datos.txt");
		if (file.exists()) {
			FileReader fr = new FileReader(file);
			BufferedReader bf = new BufferedReader(fr);
			String cad;
			while ((cad = bf.readLine()) != null) {
				System.out.println(cad);
			}
		} else {
			System.out.println("El fichero no existe");
		}
	}
}
