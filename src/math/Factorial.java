package math;

import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
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
    	System.out.print("The Factorial of "+input+" is "+factorial(input)+" = ");
    	printFactorial(input);
		
    }

	private static void printFactorial(int input) {
		// TODO Auto-generated method stub
		for(int i=input; i>0; i--){
			if(i==1) System.out.print(i);
			else System.out.print(i+" x ");
		}
	}

	private static int factorial(int input) {
		// TODO Auto-generated method stub
		if(input==2) return 2;
		return input*factorial(input-1);
	}
}
