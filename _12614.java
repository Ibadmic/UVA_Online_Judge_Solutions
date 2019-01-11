package me.mukla.acm;

import java.util.Scanner;

class _12614 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int i = 0; i < test; i++) {
			int n = sc.nextInt();
			int max = 0;
			for (int j = 0; j < n; j++) {
				int x = sc.nextInt();
				if (x > max) {
					max = x;
				}
			}
			System.out.println("Case " + (i + 1) + ": " + max);
		}
		sc.close();
	}
}
