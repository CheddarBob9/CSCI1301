/**
 * File: PAssign04.java
 * Class: CSCI 1301
 * Author: Robert Montgomery
 * Created on: Aug 26, 2024
 * Last Modified: Aug 26, 2024
 * Description: Calculate the dimensions of a rectangle
 */

import java.util.Scanner;

public class PAssign04 {
	public static void main(String[] args) {
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Ask user for rectangle dimensions and save in variables
		System.out.print("Enter width for rectangle: ");
		int width = input.nextInt();
		System.out.print("Enter height rectangle: ");
		int height = input.nextInt();
		
		// Ask user for x and y coordinates for the center of the rectangle
		System.out.print("Enter x,y value for center point of rectangle: ");
		String centerPoint = input.nextLine();
		
		// Ask user for x and y coordinates for the test point
		System.out.print("Enter x,y value for test point: ");
		String testPoint = input.nextLine();
		
		// Make and assign x and y center variables and x and y test variables
		int centerX = (int)(centerPoint.charAt(0));
		int centerY = (int)(centerPoint.charAt(2));
		System.out.println(centerX);
		System.out.println(centerY);

	}

}
