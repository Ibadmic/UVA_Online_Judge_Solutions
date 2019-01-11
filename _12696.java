package me.mukla.acm;

import java.util.Scanner;

class _12696 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		int totalAllowed = 0;
		for (int i = 0; i < test; i++) {
			String[] values = sc.nextLine().split("\\s+");
			float l = Float.parseFloat(values[0]);
			float w = Float.parseFloat(values[1]);
			float d = Float.parseFloat(values[2]);
			float weight = Float.parseFloat(values[3]);

			if (l + w + d <= 125 && weight <= 7) {
				totalAllowed++;
				System.out.println(1);
			} else if (l <= 56 && w <= 45 && d <= 25 && weight <= 7) {
				totalAllowed++;
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
		System.out.println(totalAllowed);
		sc.close();
	}
}
