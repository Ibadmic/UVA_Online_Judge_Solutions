package me.mukla.acm;

import java.util.Scanner;

class _11743 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sum = { 0, 2, 4, 6, 8, 1, 3, 5, 7, 9 };
		int test = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < test; i++) {
			String input = sc.nextLine();

			int index = input.length() - 1;
			int totalSum = 0;
			boolean needToDouble = false;
			while (index >= 0) {
				String s = "" + input.charAt(index);
				if (s.equals(" ")) {
					index--;
					continue;
				}
				int k = Integer.parseInt(s);

				if (k != 32) {
					if (needToDouble) {
						totalSum += sum[k];
						needToDouble = false;
					} else {
						totalSum += k;
						needToDouble = true;
					}

				}

				index--;
			}
			if (totalSum % 10 == 0) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}

		}
		sc.close();
	}
}
