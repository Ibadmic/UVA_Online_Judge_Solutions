package me.mukla.acm;

import java.util.Scanner;

class _11059 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index = 1;
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			sc.nextLine();
			long MaxP = 0;
			for (int i = 0; i < n; i++) {
				for (int j = i; j < n; j++) {
					long p = 1;
					for (int k = i; k <= j; k++) {
						p *= a[k];
						if (p > MaxP) {
							MaxP = p;
						}
					}
				}
			}
			System.out.println("Case #" + (index++)
					+ ": The maximum product is " + MaxP + ".");
			System.out.println();
		}
		sc.close();
	}
}
