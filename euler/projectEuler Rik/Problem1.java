package projectEuler;

public class Problem1 {

	public static void main(String[] args) {
		int start = 1;
		int defnum = 0;
		
		while(start < 1000) {
			if(start % 3 == 0 || start % 5 == 0){
				defnum = defnum + start;
			}
			start = start + 1;
		}
	
		System.out.println(defnum);
	}
}
