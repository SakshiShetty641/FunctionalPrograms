package com.bridgelabz;
import java.util.Scanner;
/**
 * @author Sakshi Shetty
 * Purpose - To print the Wind Chill Temperature
 */
public class WindChill {
	public static void main(String[] args) {
		double v, t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit");
		t = sc.nextDouble();
		System.out.println("Enter wind speed");
		v = sc.nextDouble();
		windchill(t, v);
		sc.close();
	}

	public static void windchill(double t, double v) {
		if (t > 50 || v < 3 || v > 120)
			System.out.println("Invalid Input");
		else {
			double w = 35.74 + 0.6215 * t + ((0.4275 * t - 35.75) * Math.pow(v, 0.16));
			System.out.println("Windchill for temperature " + t + "and windchill " + v + "is " + w);
		}
	}
}
