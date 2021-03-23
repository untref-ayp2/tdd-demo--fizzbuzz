package ar.edu.untref.ayp2;

/**
 * Responsabilidades: Devolver la representación "FizzBuzz" de los primeros 100
 * números enteros.
 *
 */

public class FizzBuzz {

	/**
	 * Devuelve la representación "FizzBuzz" de un número.
	 *
	 */
	public static String fizzBuzz(int i) {
		// TODO: acá se debería convertir (de alguna manera) la representación de la
		// entrada entera en String.

		if (i == 1) {
			return "1";
		}

		if (i == 3) {
			return "Fizz";
		}

		else
			return "???";

	}

}
