package nl.emelwerda.quadratics;

/**
 * Skeleton for solution to ax2 + bx +c. You need to write the algorithm to
 * solve the equation in the method
 * {@link #calculateRoots(double, double, double)}. You also need to choose test
 * cases to prove that your solution works! You put these in {@link #Roots()}.
 * To test your program you need to run it using
 * 
 * <pre>
 * java -cp target/classes nl.emelwerda.quadratics.test.TestRoots
 * </pre>
 * 
 * Any questions use WhatsApp!
 * 
 * @author smcpherso
 * 
 */
public class Roots {
	public static class RealRoots {
		public RealRoots(int numberOfRealRoots, double lower, double upper) {
			this.numberOfRealRoots = numberOfRealRoots;
			this.lower = lower;
			this.upper = upper;
		}

		public final int numberOfRealRoots;
		public final double lower;
		public final double upper;
	}

	public RealRoots calculateRoots(double a, double b, double c) {
		int numberOfRealRoots = 0;
		double lower = 0;
		double upper = 0;
		double d = b * b - 4 * a * c;
		if (d > 0) {
			numberOfRealRoots = 2;
			double root1 = (-b - d) / (2 * a);
			double root2 = (-b + d) / (2 * a);
		} else if (d == 0) {

		} else {

		}
		return new RealRoots(numberOfRealRoots, lower, upper);
	}

	public static void main(String[] args) {
		//
		// TODO: get the values of a, b & c from the program arguments (args)
		//
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);

		//
		// TODO: calculate the roots using the function calculateRoots
		//
		RealRoots realRoots = new Roots().calculateRoots(a, b, c);

		//
		// TODO: print the results.
		//
		if (realRoots.numberOfRealRoots == 2) {
			System.out.printf("there are 2 real roots, upper %f, lower = %f\n",
					realRoots.upper, realRoots.lower);
		} else if (realRoots.numberOfRealRoots == 1) {
			System.out.printf("there is 1 real roots %f\n", realRoots.upper);
		} else if (realRoots.numberOfRealRoots == 0) {
			System.out.println("no real roots");
		} else {
			throw new IllegalStateException("Can't possibly be "
					+ realRoots.numberOfRealRoots + " roots");
		}
	}
}
