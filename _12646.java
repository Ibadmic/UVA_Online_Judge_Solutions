package me.mukla.acm;

import java.util.Scanner;

class _12646 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			if (a == b && b == c) {
				System.out.println("*");
			} else if (a == b && b != c) {
				System.out.println("C");
			} else if (a == c && a != b) {
				System.out.println("B");
			} else if (b == c && b != a) {
				System.out.println("A");
			}
		}
		sc.close();
	}
}
