package me.mukla.acm;

import java.util.Scanner;

class _10879 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int v = sc.nextInt();
			String result = " " + v;
			int divisor = 0;
			for (int j = 2; j * j < v; j++) {
				if (v % j == 0) {
					result = result + " = " + j + " * " + (v / j);
					divisor++;
				}
				if (divisor == 2) {
					break;
				}
			}
			System.out.println("Case #" + (i + 1) + ":" + result);
		}
		sc.close();
	}
}
