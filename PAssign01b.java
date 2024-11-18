/**
 * File: PAssign01b.java
 * Class: CSCI 1301
 * Author: Robert Montgomery
 * Created on: Aug 26, 2024
 * Last Modified: Aug 26, 2024
 * Description: Display the area of a triangle
 */

import java.util.Scanner;

public class PAssign01b {
	
	public static void main(String[] args) {
		// add your code here
		
		// setup Scanner
		Scanner input = new Scanner(System.in);
		
		// ask the user for inputs for height and base
		System.out.print("Enter the base of the triangle, followed by the height: ");
		
		// declare variables for height and base of a triangle and assign the users input
		double userBase = input.nextDouble();
		double userHeight = input.nextDouble();
				
		// declare a variable for the area of a triangle and assign a calculation
		double area = ((userBase * userHeight) / 2);
		
		// calculate the area and output the result to the console
		System.out.println("A triangle with base " + userBase + " and height " + userHeight + " has an area of " + area + ".");
	}

}
