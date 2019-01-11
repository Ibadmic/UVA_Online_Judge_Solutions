package me.mukla.acm;

import java.util.Scanner;

class _11805 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int i = 0; i < test; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int p = sc.nextInt();

			int x = (p % n) + k;
			if (x > n) {
				x = x % n;
			}
			System.out.println("Case " + (i + 1) + ": " + x);
		}
		sc.close();
	}
}
