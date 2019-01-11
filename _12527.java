package me.mukla.acm;

import java.util.Scanner;

class _12527 {
	public static int[] houseNum = new int[5001];

	public static void main(String[] args) {
		int counter = -1;
		for (int i = 0; i < houseNum.length; i++) {
			if (!haveRepeatedDigit(i)) {
				houseNum[i] = counter + 1;
				counter = counter + 1;
			} else {
				houseNum[i] = counter;
			}
		}

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(houseNum[b] - houseNum[a-1]);

		}
		sc.close();
	}

	public static boolean haveRepeatedDigit(int n) {
		int[] digitCount = new int[10];
		while (n > 0) {
			digitCount[n % 10]++;
			n /= 10;
		}
		for (int i = 0; i < digitCount.length; i++) {
			if (digitCount[i] > 1) {
				return true;
			}
		}
		return false;
	}
}
