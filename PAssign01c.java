/**
 * File: PAssign01c.java
 * Class: CSCI 1301
 * Author: Robert Montgomery
 * Created on: Aug 26, 2024
 * Last Modified: Aug 26, 2024
 * Description: Display the pressure exerted by one mole of an ideal gas
 */

public class PAssign01c {
	
	public static void main(String[] args) {
		// add your code here
		
		// declare and assign given variables
		double volume = 0.25;
		int temperature = 313;
		double gasConstant = 8.31446;
		
		// declare and compute variables
		double pressure = (gasConstant * temperature / volume);
		
		// compute and output result to console
		System.out.println("The pressure of 1 mole(s) of an ideal gas with volume " + volume + " m^3 at temperature " + temperature + 
				" K is " + pressure + " pascals.");
	}

}
