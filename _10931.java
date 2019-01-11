package me.mukla.acm;

import java.util.Scanner;

class _10931 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int i = sc.nextInt();
			if (i == 0) {
				break;
			}

			int counter = 0;
			String binary = "";
			while (i > 0) {
				if (i % 2 == 1) {
					counter++;
				}
				binary = (i % 2) + binary;
				i = i / 2;

			}
			System.out.println("The parity of " + binary + " is " + counter
					+ " (mod 2).");
		}
		sc.close();
	}
}
