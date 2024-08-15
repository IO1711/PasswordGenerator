import java.util.ArrayList;
import java.util.*;

/**
 * Generate password
 * @author Bilolbek Rayimov
 *
 */
public class GeneratePassword {
	public static void main(String[] args) {
		
		System.out.println(generate(15));
	}
	 /**
	  * method to generate password with the given length
	  * @param length of the generated password
	  * @return the generated password
	  */
	public static String generate(int length) {
		
		//Instance var
		
		/**
		 * stores the generated password
		 */
		String password = "";
		
		/**
		 * Arraylist to store all the upper case letters
		 */
		ArrayList<Character> uppercase = new ArrayList<Character>();
		
		/**
		 * Arraylist to store all the lower case letters 
		 */
		ArrayList<Character> lowercase = new ArrayList<Character>();
		
		/**
		 * ArrayList to store all the numbers from 0 to 9
		 */
		ArrayList<Character> numbers = new ArrayList<Character>();
		
		/**
		 * Arraylist to store the special characters
		 */
		ArrayList<Character> specialChar = new ArrayList<Character>();
		
		
		/**
		 * initialize the upper case letters using ASCII table codes 
		 */
		for(int i = 65; i < 91; i++) {
			uppercase.add((char) i);
		}
		
		/**
		 * initialize the lower case letters using ASCII table codes
		 */
		for(int i = 97; i < 123; i++) {
			lowercase.add((char) i);
		}
		
		/**
		 * initialize the numbers using ASCII table
		 */
		for(int i = 48; i < 58; i++) {
			numbers.add((char) i);
		}
		
		/**
		 * initialize the special characters using ASCII table
		 */
		for(int i = 33; i < 65; i++) {
			specialChar.add((char) i);
			
			//update the i to skip the numbers in the ASCII table (48 - 57)
			if(i == 47) {
				i = 58;
			}
		}
		
		
		
		//merge all the arraylists
		
		/**
		 * initialize the merged list with the upper case Arraylist and merge others
		 */
		ArrayList<Character> mergedList = new ArrayList<>(uppercase);
		
		mergedList.addAll(lowercase);
		mergedList.addAll(numbers);
		mergedList.addAll(specialChar);
		
		
		System.out.println(uppercase.size());
		
		Random random = new Random();
		
		/**
		 * generate password with given length
		 */
		for(int i = 0; i <= length; i++) {
			password += mergedList.get(random.nextInt(mergedList.size()));
		}
		
		
		return password;
	}
}
