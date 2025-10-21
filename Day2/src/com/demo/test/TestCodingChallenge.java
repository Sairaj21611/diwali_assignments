package com.demo.test;

import java.util.Scanner;

import com.demo.beans.CodingChallengeQuestion;

public class TestCodingChallenge {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		CodingChallengeQuestion ccq = new CodingChallengeQuestion();
		
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		int ans = ccq.calculate(num);
		System.out.println("The reversed number is : "+ans);
	}
}
