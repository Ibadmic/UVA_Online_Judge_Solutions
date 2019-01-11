package me.mukla.acm;

import java.util.Scanner;

class _11689 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int testCases = sc.nextInt();
			for (int i = 0; i < testCases; i++) {
				int e = sc.nextInt();
				int f = sc.nextInt();
				int c = sc.nextInt();

				int n = e + f;
				int counter = 0;
				while (n >= c) {
					int newSoda = n / c;
					n = n - (newSoda * c) + newSoda;
					counter += newSoda;
				}
				System.out.println(counter);
			}
		}
		sc.close();
	}
}
