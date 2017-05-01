package problems;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        List<String> list = new LinkedList<String>();
        String delim = "[ .,]";
        String[] token = st.split(delim);
        
        for(int i=0; i<token.length; i++){
        	if( token[i].equalsIgnoreCase(" ") )continue;
        	String check = token[i];
        	if( list.contains(check) )continue;
        	for(int j=i+1; j<token.length; j++){
        		if( token[j].equalsIgnoreCase(check) ){
        			list.add(check);
        			break;
        		}
        	}
        }
        
        System.out.print("Duplicate Word(s): [");
        for(String print: list){
        	System.out.print(" "+print);
        }
        System.out.println(" ]");
    }

}
