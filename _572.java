package me.mukla.acm;

import java.util.Scanner;

class _572 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.nextLine();
			String[] chars = input.split("\\s+");
			int row = Integer.parseInt(chars[0]);
			int colomn = Integer.parseInt(chars[1]);
			if (row == 0) {
				break;
			}
			int[][] a = new int[row][colomn];

			for (int i = 0; i < row; i++) {
				String s = sc.nextLine();
				for (int j = 0; j < colomn; j++) {
					if (s.charAt(j) == '@') {
						a[i][j] = 1;
					} else {
						a[i][j] = 0;
					}
				}
			}
			int counter = 2;
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < colomn; j++) {
					int p = 0, q = 0, r = 0, s = 0;
					if (a[i][j] > 0) {
						if (j - 1 >= 0) {
							p = a[i][j - 1];
						}
						if (i - 1 >= 0 && j - 1 >= 0) {
							q = a[i - 1][j - 1];
						}
						if (i - 1 >= 0) {
							r = a[i - 1][j];
						}
						if (i - 1 >= 0 && j + 1 < colomn) {
							s = a[i - 1][j + 1];
						}
						int max = getMax(p, q, r, s);
						if (max > 0) {
							a[i][j] = max;
							replace(a, i, j, row, colomn);
						} else {
							a[i][j] = counter++;
						}

					}
				}
			}

			int region = 0;
			int[] regionArray = new int[row * colomn];

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < colomn; j++) {
					if (a[i][j] > 0) {
						boolean toAdd = true;
						for (int k = 0; k < region; k++) {
							if (regionArray[k] == a[i][j]) {
								toAdd = false;
								break;
							}

						}
						if (toAdd) {
							regionArray[region++] = a[i][j];
						}
					}
				}
			}
			System.out.println(region);
		}
		sc.close();
	}

	public static void go(int[][] a, int i, int j, int replace,
			int replaceWith, int row, int colomn) {
		for (int l = 0; l < row; l++) {
			for (int m = 0; m < colomn; m++) {
				if (a[l][m] == replace) {
					a[l][m] = replaceWith;
				}
			}
		}
	}

	public static void replace(int[][] a, int i, int j, int row, int colomn) {
		if (j - 1 >= 0) {
			if (a[i][j - 1] > 0) {
				go(a, i, j, a[i][j - 1], a[i][j], row, colomn);

			}
		}
		if (i - 1 >= 0 && j - 1 >= 0) {
			if (a[i - 1][j - 1] > 0) {
				go(a, i, j, a[i - 1][j - 1], a[i][j], row, colomn);
			}
		}
		if (i - 1 >= 0) {
			if (a[i - 1][j] > 0) {
				go(a, i, j, a[i - 1][j], a[i][j], row, colomn);
			}
		}
		if (i - 1 >= 0 && j + 1 < colomn) {
			if (a[i - 1][j + 1] > 0) {
				go(a, i, j, a[i - 1][j + 1], a[i][j], row, colomn);
			}
		}
	}

	public static int getMax(int p, int q, int r, int s) {
		if (q > p) {
			p = q;
		}
		if (r > p) {
			p = r;
		}
		if (s > p) {
			p = s;
		}
		return p;
	}
}
