package me.mukla.acm;

import java.util.Scanner;

class _11417 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] gcd = new int[503];
		gcd[0] = 0;
		gcd[1] = 0;
		gcd[2] = 1;

		for (int i = 3; i < gcd.length; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				sum += getGCD(i, j);
			}
			gcd[i] = sum + gcd[i - 1];
		}

		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			System.out.println(gcd[n]);
		}
		sc.close();
	}

	public static int getGCD(int min, int max) {
		if (min > max) {
			int temp = min;
			min = max;
			max = temp;
		}

		int k = 1;
		for (int i = min; i >= 1;) {
			if (max % i == 0)
				return i;
			while (true) {
				k = k + 1;
				if (min % k == 0) {
					i = min / k;
					break;
				}
			}

		}
		return 1;
	}
}
