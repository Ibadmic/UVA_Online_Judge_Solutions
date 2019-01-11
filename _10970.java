package me.mukla.acm;

import java.util.Scanner;

class _10970 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNextInt()) {
			int M = input.nextInt();
			int N = input.nextInt();
			int res = M * N - 1;
			System.out.println(res);
		}
		input.close();
	}
}
