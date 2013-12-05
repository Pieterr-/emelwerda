package nl.emelwerda.euler.test;

import nl.emelwerda.euler.Problem1;

import org.junit.Assert;
import org.junit.Test;

public class Problem1Test {

	@Test
	public void SolutionTest() {
		int solution = Problem1.solution();
		Assert.assertEquals(233168, solution);
	}
}
