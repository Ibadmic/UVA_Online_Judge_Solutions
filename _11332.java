package me.mukla.acm;

import java.util.Scanner;

class _11332 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLong()) {
			long n = sc.nextLong();
			if (n == 0) {
				break;
			}

			while (n > 9) {
				n = getDigitSum(n);
			}
			System.out.println(n);
		}
		sc.close();
	}

	public static long getDigitSum(long x) {
		long sum = 0;
		while (x > 0) {
			sum += x % 10;
			x /= 10;
		}
		return sum;
	}
}
