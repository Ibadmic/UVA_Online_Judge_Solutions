package me.mukla.acm;

import java.util.Scanner;

public class _102_Permutation {

	public static long[] cost = new long[6];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String inputSet = sc.nextLine();
			String[] items = inputSet.split("\\s+");
			int k = 0;
			long[][] A = new long[3][3];
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					A[i][j] = Long.parseLong(items[k++]);
				}
			}
			run(A);
		}
		sc.close();

	}

	public static void run(long[][] A) {
		long sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum += A[i][j];
			}
		}

		cost[0] = A[0][0] + A[1][2] + A[2][1];
		cost[1] = A[0][0] + A[1][1] + A[2][2];

		cost[2] = A[0][2] + A[1][0] + A[2][1];
		cost[3] = A[0][2] + A[1][1] + A[2][0];

		cost[4] = A[0][1] + A[1][0] + A[2][2];
		cost[5] = A[0][1] + A[1][2] + A[2][0];

		int minIndex = -1;
		for (int i = 0; i < 6; i++) {
			if (minIndex == -1) {
				minIndex = i;
			}
			cost[i] = sum - cost[i];
			if (cost[i] < cost[minIndex]) {
				minIndex = i;
			}
		}

		switch (minIndex) {
		case 0:
			System.out.println("BCG " + cost[minIndex]);
			break;
		case 1:
			System.out.println("BGC " + cost[minIndex]);
			break;
		case 2:
			System.out.println("CBG " + cost[minIndex]);
			break;
		case 3:
			System.out.println("CGB " + cost[minIndex]);
			break;
		case 4:
			System.out.println("GBC " + cost[minIndex]);
			break;
		case 5:
			System.out.println("GCB " + cost[minIndex]);
			break;

		default:
			break;
		}

	}
}
