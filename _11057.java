package me.mukla.acm;

import java.util.Scanner;

class _11057 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int money = sc.nextInt();
			sc.nextLine();

			int first = -1, second = -1, diff = 1111111;
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					if (a[i] + a[j] == money) {
						if (abs(a[i] - a[j]) < diff) {
							first = a[i];
							second = a[j];
							diff = abs(a[i] - a[j]);
						}
					}
				}
			}
			if (first > second) {
				int temp = first;
				first = second;
				second = temp;
			}
			System.out.println("Peter should buy books whose prices are "
					+ first + " and " + second + ".");
			System.out.println();

		}
		sc.close();
	}

	public static int abs(int x) {
		if (x < 0) {
			return -x;
		}
		return x;
	}
}
