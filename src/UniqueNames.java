import java.util.ArrayList;
import java.util.Scanner;

public class UniqueNames {
	
	/*
	 * Instance variables:
	 */
	
	static Scanner userInput = new Scanner(System.in);
	static ArrayList<String> nameList = new ArrayList<String>();
	
	/*
	 * Main method. a boolean, running, will keep the while loop running as long as it's true.
	 * You can set it to false by hitting the return key without typing in a name, ending the loop.
	 */
	
	public static void main(String[] args) {
		boolean running = true;
		while (running) {
			System.out.print("Enter name: ");
			String name = userInput.nextLine();
			if (name.equals("")) {
				running = false;
			} else {
				
				/*
				 * Every time a new name is entered, it will check the list of names to see if
				 * it's already there. If it is, then isDuplicate is set to true and will not
				 * add it to the list.
				 */
				
				boolean isDuplicate = false;
				for ( int i = 0; i < nameList.size(); i++) {
					if (nameList.get(i).equalsIgnoreCase(name)) {
						isDuplicate = true;
					}
				}
				if (!isDuplicate) {
					nameList.add(name);
				}
			}
		}
		System.out.println("Unique name list contains:");
		for (int i = 0; i < nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}
	}
}
