package projectEuler;

public class Problem2 {

	public static void main(String[] args) {
		int fib1 = 1;
		int fib2 = 1;
		int sum1 = 0;
		
		while(fib1 < 4000000 && fib2 < 4000000) {
			if(fib2 % 2 == 0) {
				sum1 = sum1 + fib2;
			}
			fib1 = fib1 + fib2;
			if(fib1 % 2 == 0) {
				sum1 = sum1 + fib1;
			}
			fib2 = fib1 + fib2;
		}
		System.out.println(sum1);
		
	}
	
}
