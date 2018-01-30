package me.mukla.acm;

import java.util.Scanner;

class _10018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {

			int testCases = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < testCases; i++) {
				String number = sc.nextLine();
				int counter = 0;
				while (true) {
					if (isPalindrome(number)) {
						System.out.println(counter + " " + number);
						break;
					}
					long sum = Long.parseLong(number)
							+ Long.parseLong(getReverse(number));
					number = String.valueOf(sum);
					counter++;

				}

			}

		}
		sc.close();
	}

	public static String getReverse(String number) {
		char[] arr = number.toCharArray();
		char[] reverseArr = new char[arr.length];
		int k = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			reverseArr[k++] = arr[i];
		}

		return String.copyValueOf(reverseArr);

	}

	public static boolean isPalindrome(String number) {
		char[] arr = number.toCharArray();
		int i = 0, j = arr.length - 1;
		for (int k = 0; k < arr.length; k++) {

			if (arr[i] != arr[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
