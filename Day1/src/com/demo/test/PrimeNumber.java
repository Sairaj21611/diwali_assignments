package com.demo.test;

import java.util.*;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		int count=0;
		
		for(int i=2; i<=num; i++) {
			if(i%2==0) {
				count++;
			}
		}
		if(count == 1) {
			System.out.println(num+" is prime number ");
		}
		else {
			System.out.println(num+" is not prime");
		}
	}
}
