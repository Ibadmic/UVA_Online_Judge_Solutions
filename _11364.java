package me.mukla.acm;

import java.util.Scanner;

class _11364 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();

		for (int i = 0; i < testCases; i++) {
			int store = sc.nextInt();

			int min = 101, max = 0;
			for (int j = 0; j < store; j++) {
				int x = sc.nextInt();
				if (x < min) {
					min = x;
				}
				if (x > max) {
					max = x;
				}
			}
			System.out.println(2 * (max - min));

		}
		sc.close();
	}

}
