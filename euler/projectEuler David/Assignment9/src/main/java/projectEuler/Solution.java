package projectEuler;

public class Solution {

	public static void main(String[] args) {
			
		for(int c = 3; c < 1000; c ++){
			for(int b = 2; b < c; b++){
				for(int a = 1; a < b; a++){
					if((a*a + b*b == c*c) && (a + b + c == 1000)){
						System.out.println(a*b*c);
						
					} // end of if
					
				} // end of for a
				
			} // end of for b
			
		} // end of for c
		
	} // end of main

} // end of class
