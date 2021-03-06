package parser;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProcessStudentInfo {

		/*
		 * Under XmlReader class, the parseData() will return list of Student Info which will contain Student first name, last name and score.
		 * You need to implement the method name "convertIntToChar()" which will convert String score into char Grade.('A'for 90 to 100,'B'for 80 to 89 and 
		 * 'C' for 70 to 79.
		 * 
		 * Here in the main method fill in the code that outlined to read xml data parsed into 2 separate ArrayList, then store into map. 
		 * Once map has all data, retrieve those data and out put to console.
		 *
		 * Do any necessary steps that require for below successful output.
		 * ......................................................
		 * Student (id= 1) "Sharif" "Uddin"        		Grade= B
		 * Student (id= 2) "Asif" "Roni"          		Grade= A
		 * Student (id= 3) "Kafil" "Codelab"            Grade= F
		 * Student (id= 4) "Huda" "Parking Issue"       Grade= B
		 * Student (id= 5) "Aisha" "Loop Issue"         Grade= C
		 * ......................................................
		 * 
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and to retrieve data.
		 *
		 */
			public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
				//Path of XML data to be read.
				String pathSelenium  = System.getProperty("user.dir") +"/src/parser/selenium.xml";
				String pathQtp = System.getProperty("user.dir") + "/src/parser/qtp.xml";
				String tag = "id";

				//Declare a Map with List<String> into it.
				Map<String, List<Student>> theList = new HashMap<String, List<Student>>();
				
				/*Declare 2 ArrayList with Student data type to store Selenium student into one of the ArrayList and
				  Qtp student into another ArrayList. */
				List<Student> selenium = new ArrayList<Student>();
				List<Student> qtp = new ArrayList<Student>();
				
				//Create XMLReader object.
				XmlReader xml = new XmlReader();
				
				//Parse Data using parseData method and then store data into Selenium ArrayList.
				selenium = xml.parseData(tag, pathSelenium);
				//Parse Data using parseData method and then store data into Qtp ArrayList.
				qtp = xml.parseData(tag, pathQtp);
				
				//add Selenium ArrayList data into map.
				theList.put("Selenium", selenium);
				//add Qtp ArrayList data into map.
				theList.put("QTP", qtp);
		      	
				//Retrieve map data and display output.
				for(Map.Entry<String, List<Student>> print: theList.entrySet()){
					System.out.println(print.getKey()+" "+print.getValue());
				}
				
			}

}
