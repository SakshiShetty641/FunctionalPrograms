package com.bridgelabz;
import java.util.Scanner;
/**
 * @author Sakshi Shetty
 * Purpose - To Print Euclidean Distance between the points
 */
public class EuclideanDistance {
	public static void perform(int x, int y) {
		double result = (Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2))));
		System.out.println("The Euclidean distance is: " + result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x");
		int x = sc.nextInt();
		System.out.println("Enter value of y");
		int y = sc.nextInt();
		perform(x, y);
		sc.close();

	}
}
