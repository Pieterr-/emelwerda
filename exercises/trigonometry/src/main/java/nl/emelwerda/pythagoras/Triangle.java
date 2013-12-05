package nl.emelwerda.pythagoras;

/**
 * Simple class to do calculations with a Triangle
 * @author smcpherso
 *
 */
public class Triangle {
	/**
	 * @param args
	 *            a = arg[1] b = arg[2]
	 */
	public static void main(String[] args) {
		if (args.length != 2) {
			throw new IllegalArgumentException(
					"incorrect number of arguments, should be 2");
		}
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = new Triangle().hypotenuse(a, b);
		System.out.printf("hypotenuse of triangle with sides a = %f & b = %f is c = %f ",a,b,c);
	}
	
	/**
	 * Calculates the hypotenuse of a right angle triangle with sides a & b
	 * @param a
	 * @param b
	 * @return the hypotenuse (c)
	 */
	public double hypotenuse(double a, double b) {
		return Math.sqrt(a*a +b*b);
	}
}
