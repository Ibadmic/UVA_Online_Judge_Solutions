package me.mukla.acm;

import java.util.Scanner;

public class _10812 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLong()) {

			long testCases = sc.nextLong();
			for (int i = 0; i < testCases; i++) {
				long s = sc.nextLong();
				long d = sc.nextLong();

				long loop = s - d;
				long max = d, min = 0;
				if (s == 0 && d == 0) {
					System.out.println(max + " " + min);
					continue;
				}
				boolean isPossible = false;
				for (long j = 0; j < loop; j++) {
					max++;
					min = s - max;

					if ((max - min) == d) {
						isPossible = true;
						break;
					}
				}
				if (isPossible) {
					System.out.println(max + " " + min);
				} else {
					System.out.println("impossible");
				}

			}

		}
		sc.close();
	}
}
