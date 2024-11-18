/**
 * File: PAssign08
 * Class: CSCI 1302
 * Author: Robert Montgomery
 * Created On: Nov 7, 2024
 * Last Modified: Nov 7, 2024
 * Description: Get a user entered array, and find out details about it
 */

import java.util.*;

public class PAssign08 {

	public static void main(String[] args) {

		// Create a Scanner object and other necessary variables
		Scanner input = new Scanner(System.in);
		int arrayLength = 0, userValue = 0, overAverage = 0, underAverage = 0, maxValue = Integer.MIN_VALUE, maxValueIndex = 0,
				minValue = Integer.MAX_VALUE, minValueIndex = 0;
		double total = 0 , average = 0;
		
		// Ask user to define the length of the array
		System.out.print("Enter number of values: ");
		arrayLength = input.nextInt();
		System.out.println(); // Spacing line
		
		// Create a user array with the length they determined
		int[] userArray = new int[arrayLength];
		
		// Take user input 
		for (int i = 1; i <= arrayLength; i++) {
			System.out.printf("Enter value (%d of %d): ", i, arrayLength);
			userValue = input.nextInt();
			// Populate the array with user input
			userArray[i - 1] = userValue;
			// Create running sum for later calculations
			total += userValue;
			
		} System.out.println(); // Spacing line
		
		// Calculate the average
		average = total / arrayLength;
		
		// Print userArray including the index
		for (int i = 0; i < arrayLength; i++) {
			System.out.printf("Index %d: %d%n", i, userArray[i]);
			
			// Find the max and min values and their indices
			if (userArray[i] > maxValue) {
				maxValue = userArray[i];
				maxValueIndex = i;
			} else if (userArray[i] < minValue) {
				minValue = userArray[i];
				minValueIndex = i;
			}
			
			// Find the amount of numbers above and below the average
			if (userArray[i] > average) {
				overAverage++;
			} else if (userArray[i] < average) {
				underAverage++;
			}
		}
		
		// Print data about userArray
		System.out.printf("%nMaximum: %d at index %d%n"
				+ "Minimum: %d at index %d%n"
				+ "Average: %.4f%n"
				+ "Values over average: %d%n"
				+ "Values under average: %d%n",
				maxValue, maxValueIndex,minValue, minValueIndex, average, overAverage, underAverage);
		
	} // End of main method

}
