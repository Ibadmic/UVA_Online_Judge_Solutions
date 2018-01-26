package me.mukla.acm;

import java.util.Scanner;

class _424 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String terminate = "0";
		String result = "";

		while (sc.hasNext()) {
			String input = sc.nextLine();

			if (input.equals(terminate)) {
				break;
			}
			if (result == null || result == "")
				result = input;
			else {
				result = getSum(result, input);
			}

		}
		sc.close();
		System.out.println(result);
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
