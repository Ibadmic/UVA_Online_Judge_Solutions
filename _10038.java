package me.mukla.acm;

import java.util.Scanner;

class _10038 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			boolean isConditionBreak = false;
			String inputSet = sc.nextLine();
			String[] inputArray = inputSet.split("\\s+");

			int n = Integer.parseInt(inputArray[0]);
			if (n == 1) {
				System.out.println("Jolly");
				continue;
			}

			int[] difference = new int[n - 1];

			for (int i = 0; i < difference.length; i++) {
				difference[i] = abs(Integer.parseInt(inputArray[i + 2])
						- Integer.parseInt(inputArray[i + 1]));
				if (difference[i] == 0 || difference[i] >= n) {
					System.out.println("Not jolly");
					isConditionBreak = true;
					break;
				}
			}
			if (isConditionBreak) {
				continue;
			}

			for (int i = 0; i < difference.length; i++) {
				if (getCount(difference[i], difference) == 0
						|| getCount(difference[i], difference) > 1) {
					isConditionBreak = true;
					break;
				}
			}
			if (isConditionBreak) {
				System.out.println("Not jolly");
			} else {
				System.out.println("Jolly");
			}

		}
		sc.close();
	}

	public static int abs(int x) {
		if (x < 0) {
			return -x;
		}
		return x;
	}

	public static int getCount(int value, int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (value == arr[i]) {
				count++;
			}
		}
		return count;
	}

}
