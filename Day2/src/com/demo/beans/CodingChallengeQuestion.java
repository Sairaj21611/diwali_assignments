package com.demo.beans;

public class CodingChallengeQuestion {

	int rev = 0;

	public int calculate(int num) {

		while (num != 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		return rev;
	}

}
