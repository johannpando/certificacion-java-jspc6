package com.johannpando.certificacion.scjp6.libro.capitulo6.accesoAlDisco;

import java.io.File;
import java.io.IOException;

public class ClaseFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File f = new File("datos.txt");
		File f1 = new File("directorioTemporal");
		try {
			f.createNewFile();
			// Ha creado el fichero en la raiz del proyecto, en mi caso,
			// C:\ejemplos\WORKSPACE\CertificacionJAVA-JSCP

			// Ha creado el fichero en la raiz del proyecto, en mi caso,
			// C:\ejemplos\WORKSPACE\CertificacionJAVA-JSCP
			f1.mkdir();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		creaFicheroEnDirectorioEspecificado();

		borrarCarpetaVacia(f1);
	}

	private static void borrarCarpetaVacia(File f1) {
		if (f1.delete()) {
			// ohhh, después de haber sido borrada, aún puedo acceder al nombre
			// de la carpeta, que raro....
			System.out.println("carpeta borrada " + f1.getName());

		} else {
			System.out.println("La carpeta: " + f1.getName()
					+ " no se ha podido borrar");
		}
	}

	private static void creaFicheroEnDirectorioEspecificado() {
		File f = new File("carpetaInfo");
		f.mkdir();// Si "carpetaInfo" no existiese, como ejemplo puede ser
					// "c:/carpetaInfo" que no existe, y comento el ésta línea,
					// provocaría un error la instrucción que crea el fichero:
					// fichero.createNewFile(), ya que la carpeta no existe.
		File fichero = new File(f, "info.txt");
		try {
			fichero.createNewFile();
			System.out.println(fichero.getAbsolutePath());
			borrarCarpetaVacia(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
