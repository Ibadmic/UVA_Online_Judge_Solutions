package me.mukla.acm;

import java.util.Scanner;

class _12650 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			int r = sc.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < r; i++) {
				int x = sc.nextInt();
				arr[x - 1] = 1;
			}
			if (n == r) {
				System.out.println("*");
			} else {

				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != 1) {
						System.out.print((i + 1) + " ");
					}
				}
				System.out.println();
			}

		}
		sc.close();
	}
}
