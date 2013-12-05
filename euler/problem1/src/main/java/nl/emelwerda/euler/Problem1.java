package nl.emelwerda.euler;

public class Problem1 {

	public static int solution() {
		int sum = 0;
		for (int i = 0; i < 1000; ++i) {
			if (((i % 3) == 0) || ((i % 5) == 0)) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int sum = solution();
		System.out.println("Total 0-999 = " + sum);
	}
}
