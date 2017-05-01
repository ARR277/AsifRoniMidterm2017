package problems;

import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter one word: ");
    	String input = sc.next();
    	sc.close();
    	permutation("", input);
    	System.out.println("There are "+factorialPermutation(input.length())+" possibilities");
    }

	private static int factorialPermutation(int input) {
		// TODO Auto-generated method stub
		if(input==1)return 1;
		return input*factorialPermutation(input-1);
	}

	private static void permutation(String permutation, String input) {
		// TODO Auto-generated method stub
		if(input.length()==0)System.out.println(permutation);
		else{
			for(int i=0; i<input.length(); i++){
				permutation(permutation+input.charAt(i),
						input.substring(0, i)+input.substring(i+1, input.length()) );
			}
		}
	}
}
