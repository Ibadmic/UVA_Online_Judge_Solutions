package me.mukla.acm;

import java.util.Scanner;

class _10929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String n = sc.nextLine();
			if (n.equals("0")) {
				break;
			}
			boolean isMultiple = getIsMultiple(n);

			if (isMultiple) {
				System.out.println(n + " is a multiple of 11.");
			} else {
				System.out.println(n + " is not a multiple of 11.");
			}
		}
		sc.close();
	}

	public static boolean getIsMultiple(String n) {
		char[] arr = n.toCharArray();
		int oddSum = 0, evenSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((i + 1) % 2 == 0) {
				evenSum += Character.getNumericValue(arr[i]);
			} else {
				oddSum += Character.getNumericValue(arr[i]);
			}
		}
		if ((oddSum - evenSum) % 11 == 0) {
			return true;
		}
		return false;
	}
}
