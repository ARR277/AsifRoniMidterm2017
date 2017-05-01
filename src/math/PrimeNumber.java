package math;


public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
	    	primeList(2, 1000000);
    	
	}

	private static void primeList(int num1, int num2) {
		// TODO Auto-generated method stub
		for(int i=num1; i<=num2; i++){
			int pair = 0;
			for(int j=i; j>0; j--){
				if(i%j==0)pair++;
			}
			if(pair==2) System.out.println(i);
		}
	}

}
