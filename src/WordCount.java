import java.util.Scanner;
import java.io.*;

public class WordCount {

	/*
	 * Instance Variables:
	 */
	
	static int linecount = 0;
	static int wordcount = 0;
	static int charcount = 0;
	static Scanner myScanner = new Scanner(System.in);
	
	/*
	 * Main method:
	 */

	public static void main(String[] args) {

		System.out.print("Please enter File name: ");
		String fileName = myScanner.nextLine();
		String tempString = "";
		try {
			File learText = new File(fileName);
			FileReader fileScan = new FileReader(learText);
			BufferedReader bufferRead = new BufferedReader(fileScan);

			/*
			 * Reading file line by line:
			 */
			
			while ((tempString = bufferRead.readLine()) != null) {
				charcount += tempString.length();
				String[] words = tempString.split("( )|(')");
				wordcount += words.length;
				linecount++;
			}
			bufferRead.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			System.out.println("Incorrect Input/output");
		}
		System.out.println("Line count: " + linecount);
		System.out.println("Word Count: " + wordcount);
		System.out.println("Character count: " + charcount);
	}
}