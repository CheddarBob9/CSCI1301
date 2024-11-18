/**
 * File: PAssign01a.java
 * Class: CSCI 1301
 * Author: Robert Montgomery
 * Created on: Aug 26, 2024
 * Last Modified: Aug 26, 2024
 * Description: Display the cost of items from a concession stand
 */

import java.util.Scanner;

public class PAssign01a {
	
	public static void main(String[] args) {
		// add your code here
		
		// declare variables for the convenience store items and assign prices
		double beverages = 0.50;
		double sandwiches = 2.75;
		
		// set up Scanner and ask the user for input on how many beverages and sandwiches they got
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of beverages you got, then the number of sandwiches you got: ");
		
		// declare variables for user input and assign them accordingly
		double userBeverages = input.nextDouble();
		double userSandwiches = input.nextDouble();
		
		// calculate and give output to the console
		System.out.println("The total of " + userBeverages + " beverages and " + userSandwiches +
				" sandwiches is $" + (userBeverages * beverages + userSandwiches * sandwiches) + ".");
		
	}

}
