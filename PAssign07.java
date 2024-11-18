/**
 * File: PAssign07
 * Class: CSCI 1301
 * Author: Robert Montgomery
 * Created On: Oct 28, 2024
 * Last Modified: Nov 1, 2024
 * Description: Find out information about user entered strings through methodical dissection
 */

import java.util.*;

public class PAssign07 {

	// Main method
	public static void main(String[] args) {
		
		// Create Scanner object and other variables for use
		Scanner input = new Scanner(System.in);
		String userString = "";
		char userChar = '0';
		int userInt = 0;
		boolean advance = true;
		
		// While loop to continue asking for input as long as advance is true
		while (advance == true) {
			
			System.out.print("Enter a string: ");
			userString = input.nextLine();
			
			// Check for end trigger
			if (userString.equals("STOP")) {
				advance = false;
				
			} else { 
				
				// Ask for a character
				System.out.print("Enter a character: ");
				userChar = input.nextLine().charAt(0);
				
				// Call printCount to display results to console
				printCount(userString, userChar, countCharacters(userString, userChar));
				
			} // End of if-else
			
		} // End of while loop

	} // End of main method
	
	// Method to count characters
	public static int countCharacters(String userString1, char userChar1) {
		
		// Create count variable
		int count = 0;
		
		// Find the amount of times userChar shows up in userString
		for (int i = 0; i < userString1.length(); i++) {
			if (userString1.charAt(i) == userChar1) {
				count++;
			}
		} 
		
		// Return the count
		return count;
		
	} // End of countCharacters method
	
	// Method to print the count
	public static void printCount(String userString2, char userChar2, int count) {
		
		// Print the count to the console
		System.out.printf("%c occurs in %s %d times%n", userChar2, userString2, count);
		System.out.printf("The reverse of %s is %s%n%n", userString2, reverseString(userString2));
		
	} // End of printCount method
	
	// Method to reverse the user given String
	public static String reverseString(String userString3) {
		
		// Create a String variable
		String reverseString = "";
		
		// Reverse the string and assign to corresponding variable
		for (int i = userString3.length() - 1; i >= 0; i--) {
			reverseString += userString3.charAt(i);
		}
		
		// Return the reversed string
		return reverseString;
		
	} // End of reverseString method

}