package ar.edu.untref.ayp2;

import static org.assertj.core.api.Assertions.assertThat;
import static ar.edu.untref.ayp2.FizzBuzz.fizzBuzz;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	@Test
	void deberiaPoderRepresentarElNumeroUno() {
		assertThat(fizzBuzz(1)).isEqualTo("1");
	}
}
