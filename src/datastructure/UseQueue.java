package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		String temp = "";
		int count = 0;
		Queue<String> list = new LinkedList<String>();
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
		
		System.out.println("\nAdding the element \"eddy\" to the list");
		list.add("eddy");
		System.out.println("You have entered "+(list.size()-1)+" elements plus one element.");
		System.out.println("The first element is \""+list.peek()+"\".");
		System.out.println("Removing \""+list.remove()+"\" from the list.");
		System.out.println("Now the first element is \""+list.poll()+"\".");
		System.out.println("Now you have "+list.size()+" elements.");
		System.out.print("Word List: [");
		//printing in for loop
		for(String print: list){
			System.out.print(" "+print);
		}		
		System.out.println(" ]");
		System.out.println("Adding \"beauty\" to the end of the list.");
		list.add("beauty");;
		System.out.println("Adding \"Locked\", \"today\", and \"speed\" element to the list.");
		list.add("Locked");
		list.add("today");
		list.add("speed");
		System.out.println("Removing \"eddy\" from the element.");
		list.remove("eddy");
		System.out.println("Finally adding \"123abc\" to the list");
		list.offer("123abc");
		Iterator<String> x = list.iterator();
		System.out.print("From the list: \nNew Word List: [");
		while(x.hasNext()){
			System.out.print(" "+x.next());
		}
		System.out.println(" ]");
		
	}

}
