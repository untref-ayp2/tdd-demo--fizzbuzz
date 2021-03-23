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
	public static String fizzBuzz(int numero) {

		if (numero % 3 == 0) {
			return "Fizz";
		} else if (numero % 5 == 0) {
			return "Buzz";
		} else {
			return Integer.toString(numero);
		}
	}

}
