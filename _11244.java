package me.mukla.acm;

import java.util.Scanner;

public class _11244 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.nextLine();
			String[] chars = input.split("\\s+");
			int row = Integer.parseInt(chars[0]);
			int colomn = Integer.parseInt(chars[1]);
			if (row == 0 && colomn == 0) {
				break;
			}
			int[][] a = new int[row][colomn];

			for (int i = 0; i < row; i++) {
				String s = sc.nextLine();
				for (int j = 0; j < colomn; j++) {
					if (s.charAt(j) == '*') {
						a[i][j] = 1;
					} else {
						a[i][j] = 0;
					}
				}
			}
			int counter = 0;
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < colomn; j++) {

					if (a[i][j] > 0) {
						if (j - 1 >= 0) {
							if (a[i][j - 1] > 0) {
								continue;
							}

						}
						if (j + 1 < colomn) {
							if (a[i][j + 1] > 0) {
								continue;
							}

						}
						if (i - 1 >= 0 && j - 1 >= 0) {
							if (a[i - 1][j - 1] > 0) {
								continue;
							}
						}
						if (i - 1 >= 0) {
							if (a[i - 1][j] > 0) {
								continue;
							}
						}
						if (i + 1 < row) {
							if (a[i + 1][j] > 0) {
								continue;
							}
						}
						if (i - 1 >= 0 && j + 1 < colomn) {
							if (a[i - 1][j + 1] > 0) {
								continue;
							}
						}
						if (i + 1 < row && j - 1 >= 0) {
							if (a[i + 1][j - 1] > 0) {
								continue;
							}
						}
						if (i + 1 < row && j + 1 < colomn) {
							if (a[i + 1][j + 1] > 0) {
								continue;
							}
						}

						counter++;
					}
				}
			}
			System.out.println(counter);

		}
		sc.close();
	}

}
