package me.mukla.acm;

import java.util.Scanner;

class _12403 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int account = 0;
		for (int i = 0; i < n; i++) {
			String[] input = sc.nextLine().split("\\s+");
			if (input[0].equals("report")) {
				System.out.println(account);
			} else {
				account += Integer.parseInt(input[1]);
			}
		}
		sc.close();
	}
}
