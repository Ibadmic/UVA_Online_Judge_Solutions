package me.mukla.acm;

import java.util.Arrays;
import java.util.Scanner;

class _12626 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			int[] count = new int[6];
			Arrays.fill(count, 0);
			for (int k = 0; k < input.length(); k++) {
				char x = input.charAt(k);
				if (x == 'A') {
					count[0]++;
				} else if (x == 'R') {
					count[1]++;
				} else if (x == 'M') {
					count[2]++;
				} else if (x == 'G') {
					count[3]++;
				} else if (x == 'I') {
					count[4]++;
				} else if (x == 'T') {
					count[5]++;
				}
			}

			count[0] /= 3;
			count[1] /= 2;

			int min = count[0];
			for (int j = 1; j < 6; j++) {
				if (count[j] < min) {
					min = count[j];
				}
			}
			System.out.println(min);
		}
		sc.close();
	}
}
