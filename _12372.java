package me.mukla.acm;

import java.util.Scanner;

class _12372 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int l = sc.nextInt();
			int w = sc.nextInt();
			int h = sc.nextInt();
			if (l > 20 || w > 20 || h > 20) {
				System.out.println("Case " + (i + 1) + ": bad");
			} else {
				System.out.println("Case " + (i + 1) + ": good");
			}
		}
		sc.close();
	}
}
