package projectEuler;

public class Problem4 {

	public static void main(String[] args) {
		int ver1 = 900;
		int ver2 = 900;
		int ans1;
		int newpalin = 0;
		int palin = 0;
		int thenumb1 = 0;
		int thenumb2 = 0;
		
		while(ver2<1000) {
			
			while(ver1<1000) {
				ans1 = ver1 * ver2;
				String ans2 = String.valueOf(ans1);
				char number1 = ans2.charAt(0);
				char number2 = ans2.charAt(1);
				char number3 = ans2.charAt(2);
				char number4 = ans2.charAt(3);
				char number5 = ans2.charAt(4);
				char number6 = ans2.charAt(5); 
				
				
				if(number1 == number6 && number2 == number5 && number3 == number4) {
					newpalin = ans1;
					if(newpalin > palin) {
					palin = newpalin;
					thenumb1 = ver1;
					thenumb2 = ver2;
					}
					
				}
				ver1 =ver1 + 1;
			}
			ver1 = 900;
			ver2 = ver2 + 1;
		}
		System.out.println(palin);
		System.out.println(thenumb1);
		System.out.println(thenumb2);
	}
}
