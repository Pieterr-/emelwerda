
public class Solution {

	public static void main(String[] args) {
		// Change the size of number to get the sum of any other thingy
		int number = 1000;
		int sum = 0;
		sum += amountX(number, 3);
		sum += amountX(number, 5);

		
		System.out.println("the sum is: "+ sum);
	} // end of main code

	private static int amountX(int number, int plop) {
		int Sum = 0;
		for(int i = plop; i < number; plop += plop){
			Sum += plop;
		}
		return Sum;
	} 

}
