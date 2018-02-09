package me.mukla.acm;

import java.util.Scanner;

class _10260 {
	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3,
				0, 1, 0, 2, 0, 2 };
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			String result = "";
			int prev = -111;
			for (int i = 0; i < s.length(); i++) {
				int x = a[s.charAt(i) - 65];
				if (x > 0) {
					if (prev != x) {
						result = result + x;
						prev = x;
					}

				} else {
					prev = -111;
				}
			}
			System.out.println(result);
		}
		sc.close();
	}
}
