package projectEuler;

public class Problem6 {
	
	public static void main(String args[]) {
	int ians1, ians2 = 0, firstans = 0, secondans;
	
		for(int i=1; i <= 100; i++) {
			ians1 = i*i;
			firstans = firstans + ians1;

			ians2 = ians2 + i;
			
		}
		
		secondans = ians2*ians2;
		
		int defans = Math.abs(secondans - firstans);
		System.out.println(defans);
	}
	
}