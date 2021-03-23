package ar.edu.untref.ayp2;

import static org.assertj.core.api.Assertions.assertThat;
import static ar.edu.untref.ayp2.FizzBuzz.fizzBuzz;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	@Test
	void deberiaPoderRepresentarElNumeroUno() {
		assertThat(fizzBuzz(1)).isEqualTo("1");
	}

	@Test
	void deberiaPoderRepresentarElNumeroTres() {
		assertThat(fizzBuzz(3)).isEqualTo("Fizz");
	}

	@Test
	void deberiaPoderRepresentarElNumeroCuatro() {
		assertThat(fizzBuzz(4)).isEqualTo("4");
	}

	@Test
	void deberiaPoderRepresentarElNumeroSeis() {
		assertThat(fizzBuzz(6)).isEqualTo("Fizz");
	}

	@Test
	void deberiaPoderRepresentarElNumeroDiez() {
		assertThat(fizzBuzz(10)).isEqualTo("Buzz");
	}

	@Test
	void deberiaPoderRepresentarElNumeroQuince() {
		assertThat(fizzBuzz(15)).isEqualTo("FizzBuzz");
	}

}
