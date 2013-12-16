package assignment10;

public class Solution {

	public static void main(String[] args) {
		int A = 10; // amount of primes to calculate

		System.out.println("START");

		// assigning the first prime for comparison
		int[] listPrime = new int[A];
		listPrime[0] = 2;

		// declaring the necessary variables
		int amountOfPrimes = 1;
		int X = 0; 

		for(int i = 0; i < A; i++){ 
			if((listPrime[X+1] = getNewPrime(listPrime, amountOfPrimes, X, A)) == 0){
				break;
			}
			X++;
			amountOfPrimes++;
		}

		System.out.println("The biggest prime found was: " + listPrime[amountOfPrimes - 1]);

		// finding the sum of all the primes
		long sum = 0L;
		for(int i = 0; i < amountOfPrimes; i++){
			sum += listPrime[i];
		}
		System.out.println(sum);
		System.out.println("done");
	}

	private static int getNewPrime(int[] listPrime, int amountOfPrimes, int X, int A){
		boolean valid = true;
		int potPrime = listPrime[X];

		for(int i = potPrime; i < A; i++){ // the big for that makes stuff happen
			potPrime ++;
			valid = true;

			if(potPrime % 2 != 0){ // a small filter to get out half of the numbers
				
				for(int num = 0; num < amountOfPrimes; num++){

					if(potPrime % listPrime[num] == 0){
						valid = false;
						break;
					}
				}//end of for
			}else{valid = false; continue;}

			if(valid == true){ 
				return potPrime;
			}

		}// end of for

		return 0;

	}// end of getNewPrime

}
