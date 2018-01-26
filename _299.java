package me.mukla.acm;

import java.util.Scanner;

class _299 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int testCases = Integer.parseInt(sc.nextLine());

			for (int i = 0; i < testCases; i++) {
				int numOfTrain = Integer.parseInt(sc.nextLine());
				int[] trainArray = new int[numOfTrain];

				String inputSet = sc.nextLine();
				String[] inputArray = inputSet.split("\\s+");

				for (int j = 0; j < trainArray.length; j++) {
					trainArray[j] = Integer.parseInt(inputArray[j]);
				}
				int numOfSwaps = getOptimalSwapsThroughBubbleSort(trainArray);
				System.out.println("Optimal train swapping takes " + numOfSwaps
						+ " swaps.");
			}

		}
		sc.close();
	}

	public static int getOptimalSwapsThroughBubbleSort(int[] A) {
		int counter = 0;

		for (int i = 0; i < A.length - 1; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[j] < A[i]) {
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;
					counter++;
				}
			}
		}

		return counter;
	}
}
