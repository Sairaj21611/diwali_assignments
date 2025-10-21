package com.demo.test;

import java.util.Scanner;

public class SumofOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number : ");
		int num = sc.nextInt();

		int temp = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 1) {
				temp = temp + i;
			}
		}
		System.out.println("The addition of odd number till "+num+" is "+temp);
	}
}
