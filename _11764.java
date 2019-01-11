package me.mukla.acm;

import java.util.Scanner;

class _11764 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int testCases = sc.nextInt();
			for (int i = 0; i < testCases; i++) {
				int n = sc.nextInt();

				int high = 0, low = 0, current = 0;
				int prev = sc.nextInt();
				for (int j = 1; j < n; j++) {
					current = sc.nextInt();
					if (current > prev) {
						high++;
					} else if (current < prev) {
						low++;
					}
					prev = current;
				}

				System.out.println("Case " + (i + 1) + ": " + high + " " + low);

			}
		}
		sc.close();
	}
}
