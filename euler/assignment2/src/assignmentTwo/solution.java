package assignmentTwo;

public class solution {

	public static void main(String[] args) {
		long nextNum;
		long a = 0;
		long b = 1;
		long total = 0;
		
		while(true){
			nextNum = a + b;
			a = b;
			b = nextNum;
			if(nextNum < 4000000){
				if(nextNum % 2 == 0){
					total += nextNum;
					System.out.println("the total is: " + total);
				}
			}else{
				System.out.println("the total is: " + total);
				break;
			}
			
		} // end of WHILE

	}

}
