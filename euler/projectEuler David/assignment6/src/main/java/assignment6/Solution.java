package assignment6;

public class Solution {
	
	public static int squareOfSum(int a){
		int sum = 0;
		for(int i = 1; i <= a; i++){sum += i;}
		return(sum * sum);
	}
	
	public static int sumOfSquares(int a){
		int sum = 0;
		for(int i = 1; i <= a; i ++){sum += i * i;}
		return(sum);
	}

	public static void main(String[] args) {
		int a = 100; // the number you give
		
		int b = squareOfSum(a);
		int c = sumOfSquares(a);
		
		int d = b - c;
		System.out.println("the end-number is: " + d);
	}

}
