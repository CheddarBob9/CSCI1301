/**
 * File: PAssing09
 * Class: CSCI 1301
 * Author: Robert Montgomery
 * Created on: Nov 14, 2024
 * Last Modified: Nov 15, 2024
 * Description: Help slumlord Chuck continue his reformation by telling him whether his properties are worth keeping or if he should ditch the trap house
 */

import java.util.*;

public class Passign09 {
	
	public static void main(String[] args) {
		
		// Maintenance and income array as given
		double[] annualMxCost = { 21500, 29275, 37250, 35322, 19757, 24625, 30300, 18759, 15217, 27090, 12439, 22005 };
		double[] annualIncome = { 26752, 21421, 39759, 24783, 15297, 25264, 32159, 16157, 21705, 19420, 18275, 21350 };
		double mxBeforeDonation = 0, incomeBeforeDonation = 0, mxAfterDonation = 0, incomeAfterDonation = 0;
		
		// Calculate maintenance and income before donation
		for (int i = 0; i < annualMxCost.length; i++) {
			mxBeforeDonation += annualMxCost[i];
			incomeBeforeDonation += annualIncome[i];
		}
		
		// Output total maintenance costs and incomes before donation
		System.out.printf("Total maintenance/renovation before donation: $%,.2f%n", mxBeforeDonation);
		System.out.printf("Total rental income before donation: $%,.2f%n", incomeBeforeDonation);
		
		// Array to display whether or not to keep a property in the same index
		boolean[] decision = new boolean[annualMxCost.length];
		
		// Save true or false for each element and store in decision array
		for (int i = 0; i < annualMxCost.length; i++) {
			decision[i] = keepProperty(annualMxCost[i], annualIncome[i]);
		}
		
		// Calculate maintenance and income after donation
		for (int i = 0; i < decision.length; i++) {
			if (decision[i] == true) {
				mxAfterDonation += annualMxCost[i];
				incomeAfterDonation += annualIncome[i];
			}
		}
		
		// Output total maintenance costs and incomes before donation
		System.out.printf("%nTotal maintenance/renovation after donation: $%,.2f%n", mxAfterDonation);
		System.out.printf("Total rental income after donation: $%,.2f%n", incomeAfterDonation);
		
		// Calculate income lost through donation
		double lossOfIncome = incomeBeforeDonation - incomeAfterDonation;
		
		// Output total donated loss
		System.out.printf("%nTotal Donated Rental Income: $%,.2f%n%n", lossOfIncome);
		
		// Call method printDecision
		printDecision(decision);
		
	} // End of main method
	
	public static boolean keepProperty(double mxCost, double annualIncome) {
		
		// Find maintenance cost over 4.75 years
		double totalMx = mxCost * 4.75;
		// Find income over 10.25 years
		double totalIncome = annualIncome * 10.25;
		
		// return if maintenance is above or below half of income
		if (totalMx < totalIncome / 2.0) {
			return true;
			
		} else {
			return false;
		}
		
	} // End of keepProperty method
	
	public static void printDecision(boolean[] decision) {
		String keepOrDonate = "";
		// Print property number and keep or donate on each line for each element
		for (int i = 0; i < decision.length; i++) {
			if (decision[i] == true) {
				keepOrDonate = "keep";
				
			} else {
				keepOrDonate = "donate";
			}
			System.out.printf("Property %d - %s%n", i, keepOrDonate);
		}
		
	} // End of printDecision method

}
