package me.mukla.acm;

import java.util.Scanner;

class _10127 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			if ((n % 2) == 0 || (n % 5) == 0) {
				System.out.println("0");
				continue;
			}
			int current = 1, digitCount = 1;
			while (current % n != 0) {
				current = ((current * 10) + 1) % n;
				digitCount++;
			}
			System.out.println(digitCount);
		}
		sc.close();
	}
}
