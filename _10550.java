package me.mukla.acm;

import java.util.Scanner;

class _10550 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();

			if (a == 0 && b == 0 && c == 0 && d == 0) {
				break;
			}
			int sum = 120;
			sum += turn(a, b, false);
			sum += turn(b, c, true);
			sum += turn(c, d, false);

			System.out.println(sum * 9);

		}
		sc.close();
	}

	public static int turn(int a, int b, boolean clockWise) {
		if (clockWise) {
			if (b > a)
				return (b - a);
			else
				return (40 + (b - a));
		} else {
			if (a > b)
				return (a - b);
			else
				return (40 + (a - b));
		}
	}
}
