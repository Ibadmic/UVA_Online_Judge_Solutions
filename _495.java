package me.mukla.acm;

import java.util.Scanner;

class _495 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] f = new String[5001];
		f[0] = "0";
		f[1] = "1";
		for (int i = 2; i < f.length; i++) {
			f[i] = getSum(f[i - 1], f[i - 2]);
		}
		while (sc.hasNextInt()) {
			int index = sc.nextInt();
			System.out.println("The Fibonacci number for " + index + " is "
					+ f[index]);
		}
		sc.close();
	}

	public static String getSum(String result, String input) {
		String r = "";
		char[] input1 = result.toCharArray();
		char[] input2 = input.toCharArray();

		int carry = 0, i = input1.length - 1, j = input2.length - 1;
		while (true) {
			if (i < 0 && j < 0 && carry <= 0)
				break;
			int x = 0, y = 0;
			if (i >= 0) {
				x = Character.getNumericValue(input1[i]);
			}
			if (j >= 0) {
				y = Character.getNumericValue(input2[j]);
			}

			int sum = x + y + carry;

			carry = sum / 10;
			r = Integer.toString(sum % 10) + r;
			i--;
			j--;

		}

		return r;
	}

}
