/**
 * File: PAssign06
 * Class: CSCI 1301
 * Author: Robert Montgomery
 * Created On: Oct 13, 2024
 * Last Modified: Oct 18, 2024
 * Description: Use user input to create a specific pattern of code
 */

import java.util.*;

public class PAssign06 {

	public static void main(String[] args) {
		
		// Create SCanner object for keyboard input
		Scanner input = new Scanner(System.in);
		// Prompt user for input and save to a variable
		System.out.print("Enter max number of multiples: ");
		int userValue = input.nextInt();

		// Verify positive integer only
		while (userValue <= 0) {
			System.out.println("Please enter a positive value.\n");
			if (userValue <= 0) {
				System.out.print("Enter max number of multiples: ");
				userValue = input.nextInt();
			}
		} 
	
		System.out.println("Pattern A: ");
		// Pattern A outer for loop for rows
		for (int i = 1; i <= userValue; i++) {
			int startNumber = 5;
			// Pattern A inner for loop for columns and printing
			for (int j = 1; j <= i; j ++) { 
				System.out.print(startNumber + " ");
				startNumber += 5;
			} // End of Pattern A inner loop
			System.out.println();
		} // End of Pattern A outer loop
		
		System.out.printf("%nPattern B: %n");

		// Pattern B outer for loop for rows
		for (int i = userValue; i >= 1; i--) {
			int startNumber = 5;
			// Pattern B inner for loop for columns and printing
			for (int j = 1; j <= i; j++) { 
				System.out.print(startNumber + " ");
				startNumber += 5;
			} // End of pattern B inner loop
			System.out.println();
		} // End of pattern B outer loop
		
		System.out.printf("%nPattern C: %n");

		// Pattern C outer for loop for rows
		for (int i = 1; i <= userValue; i++) {
			int startNumber = i * 5;
			// Pattern C inner for loop for columns and printing
			for (int j = i; j >= 1; j--) { 
				System.out.print(startNumber + " ");
				startNumber -= 5;
			} // End of pattern C inner loop
			System.out.println();
		} // End of pattern C outer loop
		
		System.out.printf("%nPattern D: %n");
		
		// Pattern D outer for loop for rows
		for (int i = userValue; i >= 1; i--) {
			int startNumber = i * 5;
			// Pattern D inner loop for columns and printing
			for (int j = 1; j <= i; j++) {
				System.out.print(startNumber + " ");
				startNumber -= 5;
			} // End of pattern D inner loop
			System.out.println();
		} // End of pattern D outer loop
		
		System.out.println("");

	}

}
