package com.bridgelabz;
import java.util.Scanner;
/**
 * @author Sakshi Shetty
 * Purpose - To simulate sum of three integers adds to zero 
 */

public class ArrayInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// User input to take size and elements of array.
		System.out.println("Enter size of an array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter all the elements:");

		// To take the elements only till the size of array.
		for (int index = 0; index < size; index++) {
			System.out.println("enter next value");
			a[index] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				for (int k = j + 1; k < a.length; k++) {

					if (a[i] + a[j] + a[k] == 0) {
						System.out.println("Sum of three integers from the input add to zero is " + a[i] + "," + a[j]
								+ "," + a[k]);
					} else
						System.out.println("Not found");
				}
			}
		}
		sc.close();
	}

}
