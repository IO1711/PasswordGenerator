import java.util.ArrayList;
import java.util.Random;

public class FinalGeneratePassword {

	public static void main(String[] args) {
		
		System.out.println(generate(30));

	}
	
	
	public static String generate(int length) {
		//instance variables
		
		String password = "";
		
		String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowercase = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialChar = "&%$#@!*()";
		
		String letters = uppercase + lowercase;
		
		String numChar = numbers + specialChar;
		
		//always 70% of the password consists letters
		int onlyLetters = (length*70)/100;
		
		Random random = new Random();
		
		for(int i = 0; i < onlyLetters; i++) {
			password += letters.charAt(random.nextInt(letters.length()));
		}
		
		for(int i = 0; i < length - onlyLetters; i++) {
			password += numChar.charAt(random.nextInt(numChar.length()));
		}
		
		return shufflePword(password);
	}
	
	public static String shufflePword(String password) {
		String readyPword = "";
		
		ArrayList<Character> list = new ArrayList<>();
		for(char c : password.toCharArray()) {
			list.add(c);
		}
		
		Random random = new Random();
		
		while(list.size() != 0) {
			int randomIndex = random.nextInt(list.size());
			readyPword += list.remove(randomIndex);
		}
		
		return readyPword;
	}

}
