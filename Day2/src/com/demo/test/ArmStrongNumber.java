package com.demo.test;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int num = sc.nextInt();

		int temp = num;
		int rev = 0;
		while (num != 0) {
			int digit = num % 10;
			rev = rev + digit * digit * digit;
			num = num / 10;
		}
		if (temp == rev) {
			System.out.println("The " + temp + " is armstrong number ");
		} else {
			System.out.println("The " + temp + " is not armstrong number");
		}
	}
}
