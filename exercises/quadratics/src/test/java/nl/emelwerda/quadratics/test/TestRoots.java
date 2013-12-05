package nl.emelwerda.quadratics.test;

import nl.emelwerda.quadratics.Roots;
import nl.emelwerda.quadratics.Roots.RealRoots;

/**
 * Tests for solution to ax2 + bx +c.
 * You need to write the algorithm to solve the equation in the method {@link #calculateRoots(double, double, double)}.
 * You also need to choose test cases to prove that your solution works! You put these in the test methods in this class.
 * To test your program you need to run it using
 * <pre>
 * java -cp target/classes nl.emelwerda.quadratics.Roots
 * </pre>
 * Any questions use WhatsApp!
 * 
 * @author smcpherso
 * 
 */
public class TestRoots {

	public static void main(String[] args) {
		TestRoots roots = new TestRoots();
		roots.testRealRoots();
	}

	/**
	 * Tests that your program works!
	 */
	public void testRealRoots() {
		testHasTwoRealRoots();
		testHasOneRealRoot();
		testHasNoRealRoots();
	}

	private void testHasTwoRealRoots() {
		// here you need to think of the values of a, b & c where there are 2 real roots
		// hint D (b*b -4ac) is +ve
		double a = 1;
		double b = 2;
		double c = -1;
		RealRoots roots = new Roots().calculateRoots(a, b, c);
		checkAnswer(roots, 2);
		if (roots.lower != -1) {
			throw new TestFailure("Fout moet -1 zijn");
		}
		if (roots.upper != 1) {		
		}
	}

	private void testHasOneRealRoot() {
		// TODO: here you need to think of the values of a, b & c where ther is 1 real root
		// hint D (b*b -4ac) = 0
		double a = 0;
		double b = 0;
		double c = 0;
		RealRoots roots = new Roots().calculateRoots(a, b, c);
		checkAnswer(roots, 1);
	}

	private void testHasNoRealRoots() {
		// TODO: here you need to think of the values of a, b & c where there are no real roots
		// hint D (b*b -4ac) is -ve.
		double a = 0;
		double b = 0;
		double c = 0;
		RealRoots roots = new Roots().calculateRoots(a, b, c);
		checkAnswer(roots, 0);
	}

	private void checkAnswer(RealRoots roots, int expected) {
		if (roots.numberOfRealRoots == expected) {
			System.out.printf("Bingo! Correct number of roots found = %d\n", expected);
		} else if (roots.numberOfRealRoots == 2) {
			System.out.println("Test failed!, more than one root was found.");
		} else if (roots.numberOfRealRoots == 1) {
			System.out.println("Test failed! exactly one root was found.");
		} else if (roots.numberOfRealRoots == 0) {
			System.out.println("Test failed, less than one root was found.");
		} else {
			System.out.printf("Wow! Completely Wrong ;), number of roots = %d\n", roots.numberOfRealRoots);
		}
	}
}
