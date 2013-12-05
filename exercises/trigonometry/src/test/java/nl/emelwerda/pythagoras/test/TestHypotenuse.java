package nl.emelwerda.pythagoras.test;

import nl.emelwerda.pythagoras.Triangle;
import org.junit

/**
 * Tests that your program works!
 */
public class TestHypotenuse {
	public static void main(String[] args) {
		new TestHypotenuse().testHypotenuse();
	}

    @Test
	public void testHypotenuse() {
		double c = new Triangle().hypotenuse(3.0, 4.0);
		if (c != 5) {
			System.out.println("This is because a value of 5.0 may not be exact!");
		}
		if (Math.abs(c-5) < 1E-6) {
			System.out.println("Calculating the hypoteneuse works");
		}
        else {
            System.out.println("Huh,,,,,,,,?");
        }
	}
}
