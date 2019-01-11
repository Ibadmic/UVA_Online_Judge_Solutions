package me.mukla.acm;

import java.util.Scanner;

class _10678 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi = 2 * Math.acos(0.0);
		int test = sc.nextInt();
		for (int i = 0; i < test; i++) {
			double d = sc.nextDouble();
			double l = sc.nextDouble();

			double a = l / 2;
			double b = Math.sqrt(((l / 2) * (l / 2)) - ((d / 2) * (d / 2)));
			System.out.printf("%.3f", (pi * a * b));
			System.out.println();
		}
		sc.close();
	}
}
