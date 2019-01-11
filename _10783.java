package me.mukla.acm;

import java.util.Scanner;

class _10783 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int testCases = sc.nextInt();
			for (int i = 0; i < testCases; i++) {
				int lowerBound = sc.nextInt();
				int upperBound = sc.nextInt();

				long oddSum = getOddSum(lowerBound, upperBound);
				System.out.println("Case " + (i + 1) + ": " + oddSum);
			}
		}
	}

	public static long getOddSum(int lowerBound, int upperBound) {
		long oddSum = 0;

		if (upperBound % 2 == 0) {
			upperBound -= 1;
		}

		if (lowerBound % 2 == 0) {
			lowerBound -= 1;
		} else {
			lowerBound -= 2;
		}
		oddSum = ((upperBound + 1) * (upperBound + 1) / 4)
				- ((lowerBound + 1) * (lowerBound + 1) / 4);
		return oddSum;
	}
}
