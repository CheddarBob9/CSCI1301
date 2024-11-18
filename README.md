# CSCI1301
CSCI 1301 Projects, Labs, and Other

PROJECT 1: 
NOTE: Gradescope will give input test cases for any problems that require it. Use the Scanner’s nextDouble(), nextInt(), etc. methods discussed in class to prompt the user for input and Gradescope will act as the user when your program requests it. In other words, just code user input like normal—as if a human were going to test your program.

Description:
Write three Java programs to demonstrate user input, arithmetic operators, output, and other basic program functions.

PAssign01a.java
Write a Java program that reads in a convenience store order from the user and calculates the total cost of the order. Assume the convenience store only sells two items: beverages at $0.50 each and sandwiches at $2.75 each.

Prompt the user for the number of beverages and store their entered number. Prompt the user for the number of sandwiches and store their entered number. The prices should be set/stored in variables and those variables should be used for calculations, not hard-coded numbers.

Your output should read: “The total of __ beverages and __ sandwiches is $__.__.” with all blanks filled in with appropriate values.

Expected Output (Do NOT hard code your output; use your calculated values):
Gradescope Input: 5 3
The total of 5.0 beverages and 3.0 sandwiches is $10.75.

PAssign01b.java
Write a Java program that calculates the area of a triangle given base and height. Your program should prompt the user for the base value, prompt for the height value, and output the triangle’s area: “A triangle with base __ and height __ has an area of ___.”

HINT: Be aware of integer vs. double division. In Java 1/2 is not the same as 1.0/2.0 as 1 is an integer. Java will truncate 0.5 to 0 for int data types.

Expected Output (Do NOT hard code your output; use your calculated values):
Gradescope Input: 7 9
A triangle with base 7.0 and height 9.0 has an area of 31.5.

PAssign01c.java (6 points)
The ideal gas law, PVnRT=, relates the pressure, volume, and temperature of an ideal gas. In SI units, P is the absolute pressure in pascals, V is the volume in cubic meters, n is the amount of gas in moles, R is the ideal gas constant () 8.31446JmolKR=, and T is the absolute temperature in degrees Kelvin (0 degrees Celsius = 273.15 degrees Kelvin).

Write a Java program that will determine the pressure exerted by 1 mole of an ideal gas with volume 30.25Vm= and 313TK=. Use a named constant for R. Except for R, use appropriate variable names, NOT the symbolic math representations in the equation.

This program (part c) will NOT use user-input. Simply hard-code your values for volume, temperature, and R. Pay close attention to data types (from Chapter 2) when viewing how each number prints. Experiment with the numeric types to ensure that they match the expected output.

Expected Output (Do NOT hard code your output; use your calculated values):
The pressure of 1 mole(s) of an ideal gas with volume 0.25 m^3 at temperature 313 K is 10409.70392 pascals.



PROJECT 2:
NOTE: Gradescope will give input test cases for any problems that require it. Use the Scanner’s nextDouble(), nextInt(), etc. methods discussed in class to prompt the user for input and Gradescope will act as the user when your program requests it. In other words, just code user input like normal—as if a human were going to test your program.

Description
Write a Java program that calculates a weighted-average using the weights from this course (see syllabus for individual category weights).

A weighted average of data []121,,,,nnxxxxx−= with weights []121,,,,nnwwwww−= is computed according to the formula ()112211nnnnwaxwxwxwxw−−=⋅+⋅++⋅+⋅. In this version of the formula, all percentage weights should be converted to real number values (15% = 0.15).

The program should prompt the user to enter a percentage grade for each category. Ask the user for percentage grades, in order, for: Revel Exercises, Lab Exercises, Programming Assignments, Exam 1, Exam 2, Exam 3, and Final Exam. The program should calculate and display a final percentage grade (fractional value) based on that value. Additionally, the program should keep a count of the number of grades entered and increment that count directly after receiving user input.

For instance, a Revel grade of 82.7, Programming Assignment grade of 91.5, Lab grade of 95.1, Exam 1 grade of 75.5, Exam 2 grade of 87.0, Exam 3 grade of 88.5, and Final Exam grade of 92.25 would give an 87.6425 final grade for the course.

NOTES: Calculate each weight separately. Do not combine grades/weights that are the same (for instance, exams 1, 2, and 3) or it is possible to get a different result from the Gradescope answer. Do not hard code the number of grades in the output. Do not hard code any of the numeric values in the output; use your calculated/stored values.

Expected Output using test case above (not including user prompts):
There were 7 grades entered.
The final grade for this course is 87.6425.

Sample Run using test case above (only the expected output is tested in Gradescope)
Enter Revel grade: 82.7
Enter Programming Assignments grade: 91.5
Enter Lab grade: 95.1
Enter Exam 1 grade: 75.5
Enter Exam 2 grade: 87.0
Enter Exam 3 grade: 88.5
Enter Final Exam grade: 92.25
There were 7 grades entered.
The final grade for this course is 87.6425.



PROJECT 3:
NOTE: Gradescope will give input test cases for any problems that require it. Use the Scanner’s nextDouble(), nextInt(), etc. methods discussed in class to prompt the user for input and Gradescope will act as the user when your program requests it. In other words, just code user input like normal—as if a human were going to test your program.

Description
Write a Java program that modifies and improves Programming Assignment 1a. This version
should disallow zero quantity orders (management has decided that everyone must buy at least one sandwich and at least one beverage for supply cost reasons).

Assume the convenience store only sells two items: beverages at $0.50 each and sandwiches at $2.75 each. Prices can be hard-coded, but should be set/stored in variables, and those variables should be used in all calculations.

Prompt the user for the number of beverages and store the entered quantity as a decimal number. If the quantity is positive, display the quantity and which item was ordered. If a positive quantity is entered, output product and quantity. If the user enters a zero, display an error message and ask the user, only once, for another quantity for that item. Prompt the user for the number of sandwiches and store the entered quantity. If a positive quantity is entered, output the product and quantity. If the user enters a zero, display an error message and ask the user, only once, for another quantity for that item.

Only display the order total if the number of sandwiches is greater than zero and the number of beverages is greater than zero. This should be executed with a nested-if statement or using logical operators.

If both of those conditions are not met, display a message saying that management requires at least one of each item being ordered. If they are met, display the subtotal, then the total with a 7.5% sales tax added (do not worry about any extra decimals for now, as ugly as it will be).

HINTS/NOTES
Drawing a flowchart for the required behavior of this program will help you identify what types of conditional statements to use, and when to use those statements. Pay attention to the sample runs provided in the expected output and how they operate.

Depending on the tax calculation used, a differing number of decimal places may appear in output. The method used for the expected output calculates percentage increase/decrease as a multiplication times 1.X with X being the percentage (so something like tot = sub * 1.15 for 15% as opposed to tot = sub + (sub * .15)).

If you are not using that style, it is likely going to involve differing decimal places. The other test cases will not execute if any fail, so you should use the above tax calculation method.

Do not try to oversimply output in this problem. There will be times you may need to repeat code to make this assignment work as shown.

There are multiple test cases that your code should pass if it handles everything correctly. There are cases which produce a valid order, and cases that should produce error(s). For simplicity, the inputs are grouped together in the Expected Output sections below:

Expected Output, valid input (do NOT hard code your output):
Input: 5 3 (shown), or 0 5 3, or 5 0 3

Enter the number of beverages: 5
Ordered: 5.0 beverages

Enter the number of sandwiches: 3
Ordered: 3.0 sandwiches

The subtotal of 5.0 beverages and 3.0 sandwiches is $10.75.
With tax, the total is $11.55625.
