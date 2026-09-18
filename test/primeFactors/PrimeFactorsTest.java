package primeFactors;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {

	@Test
	public void one() {
		assertEquals(List.of(), PrimeFactors.generate(1));
	}

	@Test
	public void two() {
		assertEquals(List.of(2), PrimeFactors.generate(2));
	}

	@Test
	public void three() {
		assertEquals(List.of(3), PrimeFactors.generate(3));
	}

	@Test
	public void four() {
		assertEquals(List.of(2, 2), PrimeFactors.generate(4));
	}

	@Test
	public void six() {
		assertEquals(List.of(2, 3), PrimeFactors.generate(6));
	}

	@Test
	public void nine() {
		assertEquals(List.of(3, 3), PrimeFactors.generate(9));
	}

	@Test
	public void twelve() {
		assertEquals(List.of(2, 2, 3), PrimeFactors.generate(12));
	}
}