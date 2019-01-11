package me.mukla.acm;

import java.util.Scanner;

class _12700 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < test; i++) {
			int n = Integer.parseInt(sc.nextLine());
			int b = 0, w = 0, t = 0, a = 0;
			String input = sc.nextLine();
			for (int j = 0; j < input.length(); j++) {
				char result = input.charAt(j);
				if (result == 'B') {
					b++;
				} else if (result == 'W') {
					w++;
				} else if (result == 'T') {
					t++;
				} else if (result == 'A') {
					a++;
				}

			}
			if (a == n) {
				System.out.println("Case " + (i + 1) + ": ABANDONED");
			} else if ((w + a) == n) {
				System.out.println("Case " + (i + 1) + ": WHITEWASH");
			} else if ((b + a) == n) {
				System.out.println("Case " + (i + 1) + ": BANGLAWASH");
			} else if (b > w) {
				System.out.println("Case " + (i + 1) + ": BANGLADESH " + b
						+ " - " + w);
			} else if (w > b) {
				System.out
						.println("Case " + (i + 1) + ": WWW " + w + " - " + b);
			} else if (b == w) {
				System.out.println("Case " + (i + 1) + ": DRAW " + b + " " + t);
			}

		}
		sc.close();
	}
}
