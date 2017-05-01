package datastructure;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		String temp = "";
		int count = 0;
		Stack<String> list = new Stack<String>();
		Scanner sc = new Scanner(System.in);
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
			//add to Queue elements
			list.add(temp);
			count++;
		}
		sc.close();
		Random rand = new Random();
		System.out.println("\nThe first element, bottom of the stack, is \""+list.firstElement()+"\".");
		System.out.println("The last element, top of the stack, is \""+list.peek()+"\".");
		System.out.println("Adding the element \"hold\", \"symphony\", and \"honey\" to the stack at random location.");
		list.add(rand.nextInt(12), "hold");
		list.add(rand.nextInt(12), "symphony");
		list.add(rand.nextInt(12), "honey");
		System.out.println("Now you have "+list.size()+" elements.");
		System.out.print("Word List: [");
		//printing in for loop
		for(String print: list){
			System.out.print(" "+print);
		}		
		System.out.println(" ]");
		System.out.println("Removing one element from the stack.");
		list.pop();
		int i = rand.nextInt(6);
		int j = rand.nextInt(9);
		System.out.println("The index "+i+" contains the element \""+list.get(i)
						  +"\" will be replaced with element \"good\".");
		list.set(i, "good");
		System.out.println("Adding new elements to the top stacks, \"work\", \"cake\", and \"money\".");
		list.push("work");
		list.push("cake");
		list.push("money");
		System.out.println("\nDoes the element \"Love\" exist in the list: "
				  +"\nAnswer: "+list.contains("Love")+" ; Location not Found." );
		System.out.println("\nDoes the element \""+list.get(j)+"\" exist in the list: "
						  +"\nAnswer: "+list.contains( list.get(j) )+" ; Location Found at index "
						  + list.indexOf(list.get(j)));
		System.out.println("Finally randomly removing an element from the list.");
		list.remove(rand.nextInt(8));
		Iterator<String> x = list.iterator();
		System.out.print("New Word List: [");
		while(x.hasNext()){
			System.out.print(" "+x.next());
		}
		System.out.println(" ]");

	}

}
