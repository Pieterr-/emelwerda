package projectEuler;

public class Problem7 {

// NOT WORKING YET!	
	
	public static void main(String arg[]) {
		long array[]= new long[10001];
		long l = 3L;
		array[0] = 2;
		int i = 1;
		
		while(array[10000] == 0) {
			while(array[i] == 0) {
				if(isPrime(l)) {
					array[i] = l;
					System.out.println(l);
				}else{
				l++;
				}
			}
			i++;
		}
		System.out.println(array[10000]);
		
		

	}
	
	public static boolean isPrime(long n) {
		long deler;
		
		deler = n;
		
		while(deler > 0) {
			if(n % deler != 0) {
				return false;
			}	
			deler -= 1;
			System.out.println(deler + "    " + n);
		}
		return true;	
	}

}