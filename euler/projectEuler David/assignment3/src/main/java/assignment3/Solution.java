package assignment3;

public class Solution {

	public static void main(String[] args) {
		long number = 600851475143L;
		boolean isPrime;
		long bigPrime = 0L;
		
		for(long i = 5L; i <= number; i++){
			isPrime = true;
			
			if(number % i == 0){
				for(long x = 2L; x < i; x++){
					if(i % x == 0){
						isPrime = false;
					}
				}
			}else{
				isPrime = false;
			}
			if(isPrime){
				bigPrime = i;
				System.out.println("new prime: " + bigPrime);
			}
		} // end of main for
		System.out.println("big prime: " + bigPrime);
	}

}
