package projectEuler;

public class Problem3 {

	public static void main(String[] args) {
		long num = 600851475143L;
		int deelnum = 2;
		
		while(num > 0) {
			if(num % deelnum == 0) {
				System.out.println(deelnum);
				num = num/deelnum;
				deelnum = deelnum - 1;
			}
			deelnum = deelnum + 1;
		}
	}
}
