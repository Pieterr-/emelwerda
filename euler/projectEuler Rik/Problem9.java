package projectEuler;

public class Problem9 {
	public static void main(String args[]) {
		
		for(int c = 3; c < 1000; c++) {
			for(int b=2; b < c; b++) {
				for(int a = 1; a < b; a++) {
					if(a*a + b*b == c*c && a+b+c == 1000) {
						System.out.println(a*b*c);
					}
				}
			}
		}
	}
}
