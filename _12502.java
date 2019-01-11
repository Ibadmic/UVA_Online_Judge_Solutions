package me.mukla.acm;

import java.util.Scanner;

class _12502 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			String[] input = sc.nextLine().split("\\s+");
			long a = Long.parseLong(input[0]);
			long b = Long.parseLong(input[1]);
			long z = Long.parseLong(input[2]);

			System.out.println(z * (a + (a - b)) / (a + b));
		}
		sc.close();
	}
}
