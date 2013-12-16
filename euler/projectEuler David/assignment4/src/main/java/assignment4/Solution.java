package assignment4;

public class Solution {

	public static void main(String[] args) {
		int number = 20;
		boolean found = false;
		int potNum = number + 1;
		int num = 0;
		
		while(!found){
			for(int i = 1; i <= number; i++){
				if((potNum % i == 0) && (found)){
					found = true;
					num = potNum;
				}else if((potNum % i == 0) && (i == 1)){
					found = true;
					num = potNum;
				}else{
					found = false;
					num = 0;
				}
			}			
			potNum++;
		}
		System.out.println("the first number found was: " + num);
		System.out.println("DONE");
		
		

	}

}
