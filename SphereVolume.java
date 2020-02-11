import java.util.Scanner;
import java.lang.Math;

public class SphereVolume {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("\n\tThis program will calculate the volume of any fully defined sphere for you (unit types not included).");
		System.out.print("\n\tSimply enter the diameter of the sphere (or two times the radius): ");
		
		Double dia = input.nextDouble();	
		System.out.print("\t" + dia + "? Got it.");							//		Read the diameter
		
		Double radius = dia/2;												//	Calculate the radius as diameter divided by 2	 
		
		Double V = (4/3) * Math.PI * Math.pow(radius, 3);					//		Calculate volume of the sphere using V= (4/3)*(pi)*(r^3) 
		
		System.out.print("\n\n\tThe calculated volume is: " + V + " units cubed.");							//		Print the volume 
		
		System.out.print("\n\n\tProgrammer: Ryan Richards");							//		Print the volume 
	}

}
