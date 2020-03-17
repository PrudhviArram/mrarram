// Prudhvi Arram 
//L20503482

package edu.schedule;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class SpaceMileage {

	public static int noLightYears = 20000000;
	public static int noOfLiters = 12000;
	public static float mileage;
	
	public static void main(String[] args) {
		calculateSpaceMileage(); // invoking mileage calculation method
	}

	/** method to calculate mileage */
	private static void calculateSpaceMileage() {
		 mileage = (float)noLightYears/noOfLiters; // typecasting int to float 
		 displayResuly(); // invoking display method 
	}

	/** method to print the results */
	private static void displayResuly() {
		//DecimalFormat class is used to format any number in JAVA
		//input(#.#) string specifies upto how many decimal places you want to format
		DecimalFormat df = new DecimalFormat("#.#");
		df.setRoundingMode(RoundingMode.FLOOR); // rounding mode to round towards negative infinity
		System.out.println("Light Years: "+noLightYears);
		System.out.println("Liters: "+noOfLiters);
		System.out.println("Light Years Per Liter: "+df.format(mileage));
	}

}
