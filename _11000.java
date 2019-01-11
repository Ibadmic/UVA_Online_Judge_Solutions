package me.mukla.acm;

import java.util.Scanner;

class _11000 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] arr = new long[10000000];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 2;
		int max = 0;
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			if (n < 0) {
				break;
			}

			if (max < n) {
				for (int i = (max + 3); i < n + 3; i++) {
					arr[i] = arr[i - 1] + arr[i - 2];
				}
				max = n;
			}
			System.out.println((arr[n + 1] - 1) + " " + (arr[n + 2] - 1));
		}
		sc.close();
	}
}
