package com.demo.test;

import java.util.Scanner;

public class ChallengeQuestion {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter length of number of words : ");
		int num = sc.nextInt();
		
		String[] str = new String[num];
		
		System.out.println("Enter strings : ");
		for (int i = 0; i<num; i++) {
			str[i] = sc.next();
		}
		int maxlength = 0;
		
		for(String word: str) {
			if(word.length()>maxlength) {
				maxlength = word.length();
			}
		}
		System.out.println("The maximum length number is : "+maxlength);
	}
}
