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

		if (i == 3) {
			return "Fizz";
		} else {
			return Integer.toString(i);
		}
	}

}
