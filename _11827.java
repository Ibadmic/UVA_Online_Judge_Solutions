package me.mukla.acm;

import java.util.Scanner;

class _11827 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			String input[] = s.split("\\s+");

			int max = 0;
			for (int m = 0; m < input.length - 1; m++) {
				if (input[m].equals("")) {
					continue;
				}
				for (int l = m + 1; l < input.length; l++) {
					if (input[l].equals("")) {
						continue;
					}
					int gcd = getGCD(Integer.parseInt(input[m]),
							Integer.parseInt(input[l]));
					if (max < gcd) {
						max = gcd;
					}

				}
			}
			System.out.println(max);
			
		}

		sc.close();
	}

	public static int getGCD(int min, int max) {
		if (min == 0 || max == 0) {
			return Math.max(min, max);
		}
		if (min > max) {
			int temp = min;
			min = max;
			max = temp;
		}
		int limit = (int)Math.sqrt(min);
		for (int i = min; i >= limit; i--) {
			if (min % i == 0 && max % i == 0) {
				return i;
			}
		}
		return 1;
	}
}
