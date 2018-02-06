package me.mukla.acm;

import java.util.Scanner;

class _10110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLong()) {
			long n = sc.nextLong();
			if (n == 0)
				break;

			if (isPSqure(n)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}

		sc.close();
	}

	public static boolean isPSqure(long x) {
		long root = (long) Math.floor(Math.sqrt(x));
		return root * root == x;
	}
}
