package problems;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
		LinkedList<String> temp = new LinkedList<String>();
		boolean anagram;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two words: ");
		while(sc.hasNext()){
			temp.add( sc.next() );
			count++;
			if(count==2)break;
		}
		sc.close();
		anagram = anagramWord(temp.peekFirst(), temp.peekLast());
		if(anagram) System.out.println("The word \""+temp.peekFirst()+"\" and \""+temp.peekLast()
									  +"\" are Anagram.");
		else System.out.println("The word \""+temp.peekFirst()+"\" and \""+temp.peekLast()
							   +"\" are not Anagram.");
    }

	private static boolean anagramWord(String first, String second) {
		// TODO Auto-generated method stub
		if(first.length()!=second.length())return false;
		int matches = 0;
		char[] a = first.toLowerCase().toCharArray();
		char[] b = second.toLowerCase().toCharArray();
		for(int i=0; i<a.length; i++){
			for(int j=0; j<b.length; j++){
				if(a[i]==b[j])matches++;
			}
		}
		if( matches==a.length && matches==b.length )return true;
		return false;
	}
}
