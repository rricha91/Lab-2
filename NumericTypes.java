import java.util.Scanner;

/**
   This program demonstrates how numeric types and operators behave in Java
*/
public class NumericTypes {
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);

		
// Calculate the average of two scores
		final int NUMBER = 2; // number of scores

		System.out.println("Please enter the first score:"); 				// prompt user to input score1
		int score1 = input.nextInt();										// read score1
 
		System.out.println("\nPlease enter the second score:"); 				// prompt user to input score2
		int score2 = input.nextInt();										// read score2 
		
		double average = ((double) score1 + score2) / NUMBER; 						// Find arithmetic average

		String output = "\n\t" + score1 + " and " + score2 + " have an average of " + average;	// line of output to print out
		System.out.println(output);
		
		
		
// Convert Fahrenheit temperatures to Celsius
		final double BOILING_IN_F = 212; 												// boiling temperature
		
		double fToC = (5.0/9.0) * (BOILING_IN_F - 32.0); 								// temperature in Celsius
		output = "\n\tTast 1 Complete!\n\tTask 2: Temprature Conversion\n\n\tConverting Water Boiling point from Fahrenheit to Celsius...\n\t" + BOILING_IN_F + " degrees Fahrenheit is equal to " + fToC + " degrees Celsius.";
		
		System.out.println(output);
		
																						/* 
																						 * declare a variable to hold the user’s temperature
																						 * Then prompt user to input another temperature
																						 * then read their input
																						 */
		System.out.println("\nPlease enter a tempreture in Degrees F:"); 
		double inputTempInFar = input.nextDouble();																											
		
		fToC = (5.0/9.0) * (inputTempInFar - 32.0); 											// convert the user’s temperature to Celsius
		output = "\n\t" + inputTempInFar + " in Fahrenheit is " + fToC + " degrees Celsius."; 	// print the user’s temperature in Celsius
		System.out.println(output);
		
		System.out.println("\n\tGoodbye"); // to show that the program is ended	
	}
}
