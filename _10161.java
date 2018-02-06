package me.mukla.acm;

import java.util.Scanner;

class _10161 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int step = 1, top = 0, right = 0, i = 1, j = 1;
			boolean stepOver = false;
			while (n >= 2) {
				step++;
				top++;
				j++;
				if (step >= n) {
					stepOver = true;
					break;
				}

				for (int p = 0; p < right + 1; p++) {
					step++;
					i++;
					if (step >= n) {
						stepOver = true;
						break;
					}
				}
				right++;

				if (stepOver) {
					break;
				}

				for (int q = 0; q < top; q++) {
					step++;
					j--;
					if (step >= n) {
						stepOver = true;
						break;
					}
				}

				if (stepOver) {
					break;
				}

				step++;
				right++;
				i++;
				if (step >= n) {
					stepOver = true;
					break;
				}

				for (int r = 0; r < top + 1; r++) {
					step++;
					j++;
					if (step >= n) {
						stepOver = true;
						break;
					}
				}
				top++;

				if (stepOver) {
					break;
				}

				for (int s = 0; s < right; s++) {
					step++;
					i--;
					if (step >= n) {
						stepOver = true;
						break;
					}
				}

				if (stepOver) {
					break;
				}

			}
			System.out.println(i + " " + j);
		}
		sc.close();
	}
}
