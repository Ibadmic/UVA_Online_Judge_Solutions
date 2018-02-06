package me.mukla.acm;

import java.util.Scanner;

class _10189 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resultCounter = 1;
		while (sc.hasNext()) {

			String input = sc.nextLine();
			String[] inputArray = input.split("\\s+");

			int n = Integer.parseInt(inputArray[0]);
			int m = Integer.parseInt(inputArray[1]);

			if (n == 0 && m == 0) {
				return;
			}
			char[][] field = new char[n][m];
			for (int i = 0; i < n; i++) {
				String line = sc.nextLine();
				char[] array = line.toCharArray();
				for (int j = 0; j < m; j++) {
					field[i][j] = array[j];
				}
			}
			if (resultCounter > 1) {
				System.out.println();
			}
			System.out.println("Field #" + resultCounter++ + ":");

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (field[i][j] == '*') {
						System.out.print(field[i][j]);
					} else {
						int counter = 0;

						if (j + 1 < m) {
							if (field[i][j + 1] == '*') {
								counter++;
							}
						}
						if (j - 1 >= 0) {
							if (field[i][j - 1] == '*') {
								counter++;
							}
						}
						if (i + 1 < n) {
							if (field[i + 1][j] == '*') {
								counter++;
							}
						}
						if (i - 1 >= 0) {
							if (field[i - 1][j] == '*') {
								counter++;
							}
						}
						if (i + 1 < n && j + 1 < m) {
							if (field[i + 1][j + 1] == '*') {
								counter++;
							}
						}
						if (i + 1 < n && j - 1 >= 0) {
							if (field[i + 1][j - 1] == '*') {
								counter++;
							}
						}
						if (i - 1 >= 0 && j + 1 < m) {
							if (field[i - 1][j + 1] == '*') {
								counter++;
							}
						}
						if (i - 1 >= 0 && j - 1 >= 0) {
							if (field[i - 1][j - 1] == '*') {
								counter++;
							}
						}

						System.out.print(counter);
					}
				}
				System.out.println();
			}

		}

		sc.close();
	}
}
