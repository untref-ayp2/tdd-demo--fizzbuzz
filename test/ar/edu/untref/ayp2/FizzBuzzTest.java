package ar.edu.untref.ayp2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	@Test
	void deberiaPoderRepresentarElNumeroUno() {
		FizzBuzz fb = new FizzBuzz();
		assertThat(fb.fizzBuzz(1)).isEqualTo("1");
	}
}
