package com.bridgelabz;
import java.util.Scanner;
/**
 * @author Sakshi Shetty
 * Purpose - To print the roots of quadratic equation
 */
public class Quadratic {
	public static void main(String[] args) {
		int a, b, c;
		System.out.println("Enter the value of a");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("Enter the value of b");
		b = sc.nextInt();
		System.out.println("Enter the value of c");
		c = sc.nextInt();
		quadratic(a, b, c);

	}

	public static void quadratic(int a, int b, int c) {
		double delta;
		delta = b * b - 4 * a * c;
		if (delta > 0) {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Roots of equation are" + x1 + "and" + x2);
		}
	}
}
