package me.mukla.acm;

import java.util.Scanner;

class _10924 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.nextLine();
			boolean isPrime = isSumPrime(input);
			if (isPrime) {
				System.out.println("It is a prime word.");
			} else {
				System.out.println("It is not a prime word.");
			}
		}
		sc.close();
	}

	public static boolean isSumPrime(String input) {
		int value = 0;
		char nameChars[] = input.toCharArray();

		for (int i = 0; i < nameChars.length; i++) {
			if ((int) nameChars[i] >= 97 && (int) nameChars[i] <= 122) {
				value += (int) nameChars[i] - 96;
			} else if ((int) nameChars[i] >= 65 && (int) nameChars[i] <= 90) {
				value += (int) nameChars[i] - 38;
			}
		}

		return isPrime(value);
	}

	public static boolean isPrime(int value) {
		if (value == 1 || value == 2) {
			return true;
		}
		if (value % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i <= value; i = i + 2) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}
}
