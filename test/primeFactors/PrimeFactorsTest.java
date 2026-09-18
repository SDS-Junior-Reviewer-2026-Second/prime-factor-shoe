package primeFactors;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PrimeFactorsTest {

	PrimeFactors primeFactors = new PrimeFactors();

	@Test
	public void one() {
		assertEquals(List.of(), primeFactors.generate(1));
	}

	@Test
	public void two() {
		assertEquals(List.of(2), PrimeFactors.generate(2));
	}

	@Test
	public void three() {
		assertEquals(List.of(3), PrimeFactors.generate(3));
	}



}
