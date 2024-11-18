/**
 * File: PAssign02.java
 * Class: CSCI 1301
 * Author: Robert Montgomery
 * Created on: Sep 5, 2024
 * Last Modified: Sep 5, 2024
 * Description: Write a Java program that calculates a weighted-average using the weights from this course
 */

import java.util.Scanner;

public class PAssign02 {
	
	public static void main(String[] args) {
		
		// Create a Scanner and ask the user for grades for each category of the class
		Scanner input = new Scanner(System.in);
		
		// Declare a variable to count the number of inputs
		int count = 0;
		
		// Ask the user for inputs
		System.out.print("Enter Revel grade: ");
		double revelGrade = input.nextDouble();
		count += 1;
		
		System.out.print("Enter Programming Assignments grade: ");
		double pAGrade = input.nextDouble();
		count += 1;
		
		System.out.print("Enter Lab grade: ");
		double labGrade = input.nextDouble();
		count += 1;
		
		System.out.print("Enter Exam 1 grade: ");
		double examOneGrade = input.nextDouble();
		count += 1;
		
		System.out.print("Enter Exam 2 grade: ");
		double examTwoGrade = input.nextDouble();
		count += 1;
		
		System.out.print("Enter Exam 3 grade: ");
		double examThreeGrade = input.nextDouble();
		count += 1;
		
		System.out.print("Enter Final Exam grade: ");
		double finalExamGrade = input.nextDouble();
		count += 1;
		
		// declare variables for the weights of assignments
		double revelWeight = 0.1;
		double pAWeight = 0.1;
		double labWeight = 0.1;
		double examOneWeight = 0.15;
		double examTwoWeight = 0.15;
		double examThreeWeight = 0.15;
		double finalExamWeight = 0.25;
		
		// Display the counted inputs
		System.out.println("There were " + count + " grades entered.");
		
		// Calculate the final grade for the course and output to console
		double finalGrade = (revelGrade * revelWeight) + (pAGrade * pAWeight) + (labGrade * labWeight) + (examOneGrade * examOneWeight) + 
				(examTwoGrade * examTwoWeight) + (examThreeGrade * examThreeWeight) + (finalExamGrade * finalExamWeight);
		
		System.out.println("The final grade for this course is " + finalGrade + ".");
		
	}

}
