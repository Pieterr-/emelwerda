package assignmentThree;

public class solution {

	public static void main(String[] args) {
		int A = 100; // amount of primes to calculate
		
		int[] listPrime = new int[A];
		listPrime[0] = 2;
		int amountOfPrimes = 1;
		int X = 0;
		
		for(int i = amountOfPrimes + 1; i < A + 1; i++){ 
			listPrime[X+1] = getNewPrime(listPrime, amountOfPrimes, X);
			X++;
			amountOfPrimes++;
		}
		
//
// TODO Print out the wanted result
//
		System.out.println(listPrime[amountOfPrimes - 1]);
		System.out.println("done");
	}
	
	private static int getNewPrime(int[] listPrime, int amountOfPrimes, int X){
		int potPrime = listPrime[X];
		
		
		while(true){
			potPrime ++;
			boolean valid = true;
			
			for(int num = 0; num < amountOfPrimes; num++){
				if(potPrime % listPrime[num] == 0){
					valid = false;
				}
			}//end of for
				
			if(valid == true){
				return potPrime;	
			}
		}// end of while	
		
	}// end of getNewPrime
	
}
