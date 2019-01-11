package me.mukla.acm;

import java.util.Scanner;

class _12602 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			input.toUpperCase();
			int first = 0;
			int second = Integer.parseInt(input.substring(4));
			for (int j = 0; j < 3; j++) {
				int x = (int) input.charAt(j) - 65;
				first += Math.pow(26, 2 - j) * x;
			}
			if (abs(first - second) < 100) {
				System.out.println("nice");
			} else {
				System.out.println("not nice");
			}
		}
		sc.close();
	}

	public static int abs(int x) {
		if (x < 0)
			return -x;
		return x;
	}
}
