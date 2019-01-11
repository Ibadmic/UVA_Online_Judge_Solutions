package me.mukla.acm;

import java.util.Scanner;

class _12611 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int i = 0; i < test; i++) {
			int r = sc.nextInt();
			int length = r * 5;
			int y = (length * 60/100)/2;
			int xLeft = (length * 45) / 100;
			int xRight = (length * 55) / 100;

			System.out.println("Case " + (i + 1) + ":");
			System.out.println((-xLeft) + " " + y);
			System.out.println(xRight + " " + y);
			System.out.println(xRight + " " + (-y));
			System.out.println((-xLeft) + " " + (-y));
		}
		sc.close();
	}
}
