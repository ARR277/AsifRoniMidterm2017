package math;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *	10 times 
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		
    	Scanner sc = new Scanner(System.in);
    	int input = 0;
    	boolean isNumber;
    	
    	System.out.print("Please Enter Number: ");
    	
    	do {
			if (sc.hasNextInt()) {
				input = sc.nextInt();
				isNumber = true;
			}
			else{
				System.err.print("Invalid Number. Please Enter ONLY A Number: ");
				isNumber = false;
				sc.next();
			}
		} while ( !isNumber);
    	sc.close();
		
		printPattern(input);
		
	}

	private static void printPattern(int input) {
		// TODO Auto-generated method stub
		int decrement = 1;
		int countPattern = 0;
		while(input>=0){
			System.out.print(input+" ");
			input -= decrement;
			countPattern++;
			if(countPattern==10){
				countPattern=0;
				decrement++;
			}
		}
	}
}
