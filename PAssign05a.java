/**
 * File: PAssign05.java
 * Class: CSCI 1301
 * Author: Robert Montgomery
 * Created on: Oct 2, 2024
 * Last Modified: Oct 18, 2024
 * Description: Read exam grades entered by a user and determine valid, invalid, highest, and lowest
 */

import java.util.Scanner;

public class PAssign05a {

	public static void main(String[] args) {

		// Create Scanner object for keyboard input
		Scanner input = new Scanner(System.in);
		
		// declare and assign variables 
		int grade = 0, validCount = 0, errorCount = 0, aCount = 0, bCount = 0, cCount = 0, dCount = 0, fCount = 0;
		double highestGrade = 0, lowestGrade = 0;
		
		// While loop with sentinel number to exit
		while (grade != -999) {
			// Ask user to enter an integer
			System.out.print("Enter grade from 0-100, -999 to stop: ");
			grade = input.nextInt();
			if (grade >= 101) {
				// Output error message if greater than 100
				System.out.println("Error: This is not a valid score.");
				errorCount++;
			// Determine letter grade
			} else if (grade >= 90 && grade < 101) {
				aCount++;
				validCount++;
				// Decide if grade is highest or lowest
				if (grade >= 0 && grade <= 100 && grade > highestGrade) {
					highestGrade = grade;
				} else if (grade <= 100 && grade >= 0) {
					lowestGrade = grade;
				} 
			// Determine letter grade
			} else if (grade >= 80 && grade < 90) {
				bCount++;
				validCount++;
				// Decide if grade is highest or lowest
				if (grade >= 0 && grade <= 100 && grade > highestGrade) {
					highestGrade = grade;
				} else if (grade <= 100 && grade >= 0) {
					lowestGrade = grade;
				} 
			// Determine letter grade
			} else if (grade >= 70 && grade < 80) {
				cCount++;
				validCount++;
				// Decide if grade is highest or lowest
				if (grade >= 0 && grade <= 100 && grade > highestGrade) {
					highestGrade = grade;
				} else if (grade <= 100 && grade >= 0) {
					lowestGrade = grade;
				} 
			// Determine letter grade
			} else if (grade >= 60 && grade < 70) {
				dCount++;
				validCount++;
				// Decide if grade is highest or lowest
				if (grade >= 0 && grade <= 100 && grade > highestGrade) {
					highestGrade = grade;
				} else if (grade <= 100 && grade >= 0) {
					lowestGrade = grade;
				} 
			// Determine letter grade
			} else if (grade >= 0 && grade < 60) {
				fCount++;
				validCount++;
				// Decide if grade is highest or lowest
				if (grade >= 0 && grade <= 100 && grade > highestGrade) {
					highestGrade = grade;
				} else if (grade <= 100 && grade >= 0) {
					lowestGrade = grade;
				} 
			// Output error message if input is less than 0
			} else if (grade > -999 && grade < 0) {
				System.out.println("Error: This is not a valid score.");
				errorCount++;
			}
		} 
		
		// Output final message with values
		System.out.printf("%nValid grades: \t\t%d %nInvalid Grades: \t%d %nHighest Grade: \t\t%.2f %nLowest Grade: "
				+ "\t\t%.2f%n %nAs: \t%d %nBs: \t%d %nCs: \t%d %nDs: \t%d %nFs: \t%d%n",
				validCount, errorCount, highestGrade, lowestGrade, aCount, bCount, cCount, dCount, fCount);
		
	}

}
