package me.mukla.acm;

import java.util.Scanner;

class _382 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("PERFECTION OUTPUT");
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				System.out.println("END OF OUTPUT");
				break;
			}
			System.out.format("%5d", n);

			System.out.println("  " + getDefenition(n));
		}
		sc.close();
	}

	public static String getDefenition(int n) {
		int sum = 0;
		if (n > 1) {
			sum = 1;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				sum += i + (n / i);
			}
		}
		if (sum > n) {
			return "ABUNDANT";
		} else if (sum < n) {
			return "DEFICIENT";
		}
		return "PERFECT";
	}
}
