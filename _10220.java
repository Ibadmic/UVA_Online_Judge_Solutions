package me.mukla.acm;

import java.math.BigInteger;
import java.util.Scanner;

class _10220 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int digitSum[] = new int[1001];

		BigInteger factorial = BigInteger.ONE;
		for (int i = 1; i <= 1000; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
			String value = factorial.toString();
			for (int j = 0; j < value.length(); j++) {
				digitSum[i] += value.charAt(j) - '0';
			}
		}

		while (sc.hasNext()) {
			System.out.println(digitSum[sc.nextInt()]);

		}
		sc.close();
	}
}
