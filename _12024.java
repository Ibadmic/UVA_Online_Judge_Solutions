package me.mukla.acm;

import java.util.Scanner;

class _12024 {
	public static void main(String[] args) {
		int[] factorial = new int[13];
		int[] derangement = new int[13];
		factorial[0] = 1;
		for (int i = 1; i < factorial.length; i++) {
			factorial[i] = i * factorial[i - 1];
		}
		derangement[0] = 1;
		derangement[1] = 0;
		for (int i = 2; i < derangement.length; i++) {
			derangement[i] = (i - 1)
					* (derangement[i - 1] + derangement[i - 2]);
		}

		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < test; i++) {
			int n = Integer.parseInt(sc.nextLine());
			System.out.println(derangement[n] + "/" + factorial[n]);
		}
		sc.close();
	}
}
