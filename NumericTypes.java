import java.util.Scanner;

/**
   This program demonstrates how numeric types and operators behave in Java
*/
public class NumericTypes {
	public static void main (String [] args) {
		
		//TASK #2 Create a Scanner object here 
		//identifier declarations
		
		
		String output; // line of output to print out
		
		//Task #2 prompt user to input score1
		//Task #2 read score1 
		//Task #2 prompt user to input score2
		//Task #2 read score2 
		// Find an arithmetic average
		
		final int NUMBER = 2; // number of scores
		int score1 = 100; // first test score
		int score2 = 95; // second test score
		
		double average = ((double) score1 + score2) / NUMBER; // arithmetic average
		
		
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		
		// Convert Fahrenheit temperatures to Celsius
		
		final double BOILING_IN_F = 212; 					// boiling temperature
		
		
		
		double fToC = (5.0/9.0) * (BOILING_IN_F - 32.0); 	// temperature in Celsius
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		
		System.out.println(output);
		
		Scanner input = new Scanner(System.in);
		double inputTempInFar = input.nextDouble();								// declare a variable to hold the user’s temperature
																				// Then prompt user to input another temperature
																				// then read their input
	
		double fToC = (5.0/9.0) * (inputTempInFar - 32.0); 						// convert the user’s temperature to Celsius
		output = InputTempInFar + " in Fahrenheit is " + fToC + " in Celsius."; // print the user’s temperature in Celsius
		
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}
