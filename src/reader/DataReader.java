package reader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataReader {

//	final static String FILENAME = "C:\\Users\\User\\Desktop\\text.txt";
	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		
		String FILENAME = System.getProperty("user.dir") + "\\src\\data\\self-driving-car";
		BufferedReader br = null;
		FileInputStream fr = null;

		try {

			fr = new FileInputStream(FILENAME);
			br = new BufferedReader(new InputStreamReader(fr));

			String sCurrentLine;

			br = new BufferedReader(new FileReader(FILENAME));

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch(IOException i){
			i.printStackTrace();
		}finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	
	}

}
