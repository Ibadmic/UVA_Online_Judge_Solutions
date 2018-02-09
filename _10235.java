package me.mukla.acm;

import java.util.Scanner;

class _10235 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			if (isPrime(n)) {
				int r = getReverse(n);
				if (n != r &&isPrime(r)) {
					System.out.println(n + " is emirp.");
				} else {
					System.out.println(n + " is prime.");
				}
			} else {
				System.out.println(n + " is not prime.");
			}
		}
		sc.close();
	}

	public static boolean isPrime(int x) {
		if(x == 2){
			return true;
		}
		if (x % 2 == 0) {
			return false;
		}

		for (int i = 3; i * i <= x; i = i + 2) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int getReverse(int x) {
		String input = "" + x;
		String result = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			result = result + input.charAt(i);
		}
		return Integer.parseInt(result);
	}
}
