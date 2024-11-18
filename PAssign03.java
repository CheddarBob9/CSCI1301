/**
 * File: PAssign03.java
 * Class: CSCI 1301
 * Author: Robert Montgomery
 * Created on: Sep 12, 2024
 * Last Modified: Sep 12, 2024
 * Description: Write a Java program that improves PAssign01
 */

import java.util.Scanner;

public class PAssign03 {
	public static void main(String[] args) {
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Declare variables for prices of beverages and sandwiches
		double beverageCost = 0.50;
		double sandwichCost = 2.75;
		
		// Ask for the number of beverages ordered
		System.out.print("Enter the number of beverages: ");
		double numberOfBevs = input.nextDouble();
		
		// If statement for positive beverage number
		if (numberOfBevs > 0) { 
			System.out.println("Ordered: " + numberOfBevs + " beverages \n");
		} else {
			System.out.println("ERROR: A quantity of zero is not allowed \n");
		}
		
		// If statement for zero beverages
		if (numberOfBevs == 0) {
			System.out.print("Enter the number of beverages: ");
			numberOfBevs = input.nextDouble();
			System.out.println("Ordered: " + numberOfBevs + " beverages \n");
		}
		
		// Ask for the number of sandwiches ordered
		System.out.print("Enter the number of sandwiches: ");
		double numberOfSands = input.nextDouble();
		
		// If statement for positive sandwich number
		if (numberOfSands > 0) {
			System.out.println("Ordered: " + numberOfSands + " sandwiches \n");
		} else {
			System.out.println("ERROR: A quantity of zero is not allowed \n");
		}
		
		// If statement for zero sandwiches
		if (numberOfSands == 0) {
			System.out.print("Enter the number of sandwiches: ");
			numberOfSands = input.nextDouble();
			System.out.println("Ordered: " + numberOfSands + " sandwiches \n");
		}
		
		// Calculate the order subtotal
		double subTotal = numberOfBevs * beverageCost + numberOfSands * sandwichCost;
		
		// Calculate the total with tax
		double totalWithTax = subTotal * 1.075;

		// Display the subtotal and total with tax
		System.out.println((numberOfBevs > 1 && numberOfSands > 1) ? "The subtotal of " +
		numberOfBevs + " beverages and " + numberOfSands + " sandwiches is $" + subTotal + 
		".\n" + "With tax, the total is $" + totalWithTax + "." : "Your order total could " + 
		"not be calculated due to a zero quantity for an item.");
		
	}
}
