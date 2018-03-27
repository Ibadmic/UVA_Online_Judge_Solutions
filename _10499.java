package me.mukla.acm;

import java.util.Scanner;

class _10499 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLong()) {
			long n = sc.nextLong(); 
			if (n < 0) {
				break;
			} else if (n == 1 || n == 0) {
				System.out.println("0%");
				continue;
			}
			long profit = n * 25;
			System.out.println(profit + "%");
		}
		sc.close();
	}
}
