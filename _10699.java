package me.mukla.acm;

import java.util.Scanner;

public class _10699 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLong()) {
			long n = sc.nextLong();
			if (n == 0) {
				break;
			}
			System.out.println(n + " : " + primeFactors(n));
		}
		sc.close();
	}

	public static int primeFactors(long number) {
		int[] factors = new int[100];
		int counter = 0;
		boolean twoFound = false;
		while (number % 2 == 0) {

			number /= 2;
			if (twoFound) {
				continue;
			} else {
				twoFound = true;
				factors[counter++] = 2;
			}
		}

		for (int i = 3; i * i <= number; i = i + 2) {
			while (number % i == 0) {
				boolean found = false;

				number /= i;
				for (int j = 0; j < counter; j++) {
					if (factors[j] == i) {
						found = true;
						break;
					}
				}
				if (!found) {
					factors[counter++] = i;
				}
			}
		}
		if (number > 1) {
			counter++;
		}
		return counter;
	}
}
