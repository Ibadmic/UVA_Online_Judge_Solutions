package me.mukla.acm;

import java.util.Scanner;

public class _10079 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLong()) {
			long n = sc.nextLong();

			if (n < 0) {
				break;
			}

			long result = (long)((n * (n + 1) / 2)) + 1;
			System.out.println(result);
		}
		sc.close();
	}

}
