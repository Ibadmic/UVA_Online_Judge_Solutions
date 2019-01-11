package me.mukla.acm;

import java.util.Scanner;

class _12578 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double l, w, r, areaRect, areaCircle, pi = 3.14159265359;
		for (int i = 0; i < n; i++) {
			l = sc.nextDouble();
			w = l * .6;
			r = l / 5;

			areaRect = l * w;
			areaCircle = pi * r * r;
			System.out.printf("%.2f %.2f", areaCircle, (areaRect - areaCircle));
			System.out.println();
		}
		sc.close();
	}
}
