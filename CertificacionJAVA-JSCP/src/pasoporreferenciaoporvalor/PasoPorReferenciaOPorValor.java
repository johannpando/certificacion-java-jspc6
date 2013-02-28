package pasoporreferenciaoporvalor;

import java.util.ArrayList;

public class PasoPorReferenciaOPorValor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer var = 0;
		System.out.println("Id var en main = " + System.identityHashCode(var));
		ArrayList<Integer> arrayInteger = new ArrayList<Integer>();
		arrayInteger.add(var);
		System.out.println("Id arrayInteger en main = "
				+ System.identityHashCode(arrayInteger));
		pasoPorValor(var);
		System.out.println("Valor de var en main = " + var);
		pasoPorValorII(arrayInteger);
		System.out.println("Valor de arrayInteger en main = "
				+ arrayInteger.get(0));
	}

	private static void pasoPorValorII(ArrayList<Integer> arrayInteger) {
		System.out.println("Id arrayInteger en método = "
				+ System.identityHashCode(arrayInteger));
		// arrayInteger.set(0, 12);
		arrayInteger = null;

	}

	private static void pasoPorValor(Integer var) {
		var = 2 * 6;
		System.out.println("Valor de var en método = " + var);
		System.out
				.println("Id var en método = " + System.identityHashCode(var));
	}

}
