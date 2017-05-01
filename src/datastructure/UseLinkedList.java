package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		String temp;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		LinkedList<String> stringArr = new LinkedList<String>();
		System.out.print("Enter any words:\n\t- Must be at least 15 words."
						+"\n\t- Enter \"StopAPP\" to finish the entering."
						+"\n\t- Enter \"OverrideExit\" to terminate the application."
						+"\nStart: ");
		while(sc.hasNext()){
			temp = sc.next();
			if(temp.equalsIgnoreCase("StopAPP")){
				if(count<15){
					System.err.print("You have not entered at least 15 words."
							        +"\nTotal Word(s): "+count+"\nContinue: ");
					continue;
				}
				break;
			}
			if(temp.equalsIgnoreCase("overrideExit"))System.exit(0);
			//add Linkedlist
			stringArr.add(temp);
			count++;
		}
		sc.close();
		Random rand = new Random();
		
		System.out.println("\nYou have "+stringArr.size()+" elements.");
		System.out.println("The first element is \""+stringArr.peek()+"\".");
		System.out.println("Removing \""+stringArr.removeFirst()+"\" from the list.");
		System.out.println("Now the first element is \""+	stringArr.peek()+"\".");
		System.out.println("Now you have "+stringArr.size()+" elements.");
		System.out.print("Word List: [");
		//printing in for loop
		for(String print: stringArr){
			System.out.print(" "+print);
		}		
		System.out.println(" ]");
		System.out.println("Adding \"Orange\" to the end of the list.");
		stringArr.addLast("Orange");
		System.out.println("Adding [ Yellow Mango breakfast github ] to the list at random location.");
		stringArr.add(rand.nextInt(15), "Yellow");
		stringArr.add(rand.nextInt(15), "Mango");
		stringArr.add(rand.nextInt(15), "breakfast");
		stringArr.add(rand.nextInt(15), "github");
		Iterator<String> x = stringArr.iterator();
		System.out.print("From the list: \nNew Word List: [");
		while(x.hasNext()){
			System.out.print(" "+x.next());
		}
		System.out.println(" ]");
		System.out.println("The first element is \""+stringArr.getFirst()
						  +"\" and the last element is \""+stringArr.getLast()+"\".");
		int i = rand.nextInt(stringArr.size());
		int j = rand.nextInt(stringArr.size());
		System.out.println("The element of randomly selected index "+i+" is \""+stringArr.get(i)+"\".");
		System.out.println("The element of randomly selected index "+j+" is \""+stringArr.get(j)+"\".");
		System.out.println("Adding \"Mario\" to the first list.");
		stringArr.addFirst("Mario");
		System.out.println("Now you have "+stringArr.size()+" elements.");
		System.out.print("Newer Word List: [");
		//printing in for loop
		for(String print: stringArr){
			System.out.print(" "+print);
		}		
		System.out.println(" ]");
	}

}
