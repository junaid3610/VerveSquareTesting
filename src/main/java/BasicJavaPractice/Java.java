package BasicJavaPractice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class Java {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		// count the number in the string	
//			String s="a1b2c3d4";
//			String a = s.replaceAll("[^0-9]", "");
//			System.out.println(a);
//			int sum=0;
//			for(int i=0;i<a.length();i++) {
//				sum +=Character.getNumericValue(a.charAt(i));
//		
//			}System.out.println(sum);
//		
//				String b = s.replaceAll("[^A-Z]", "");
//				System.out.println(b);
		

	// write a programme "ABC123abc@" print small, capital, number and special character from the given string,
		
		 // Input string
        String input = "ABC123abc@";
        // StringBuilder objects to store categorized characters
        StringBuilder smallLetters = new StringBuilder();
        StringBuilder capitalLetters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        StringBuilder specialCharacters = new StringBuilder();

        // Iterate through each character in the string
        for (char ch : input.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                smallLetters.append(ch); // Append lowercase letters, Append method is used to add data in the String builder
            } else if (Character.isUpperCase(ch)) {
                capitalLetters.append(ch); // Append uppercase letters
            } else if (Character.isDigit(ch)) {         // character is wrapper class,provides utility methods
                numbers.append(ch); // Append digits
            } else {
                specialCharacters.append(ch); // Append special characters
            }
        }

        // Print results
        System.out.println("Small Letters: " + smallLetters);
        System.out.println("Capital Letters: " + capitalLetters);
        System.out.println("Numbers: " + numbers);
        System.out.println("Special Characters: " + specialCharacters);

	
	}
	
}
