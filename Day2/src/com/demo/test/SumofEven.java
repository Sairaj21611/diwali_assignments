package com.demo.test;

import java.util.Scanner;

public class SumofEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int num = sc.nextInt();

		int temp = 0;

		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				temp = temp + i;
			}
		}
		System.out.println("The addition of all even number till "+num+" is "+temp);
	}
}
