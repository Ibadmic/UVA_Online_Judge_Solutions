package me.mukla.acm;

import java.util.Scanner;

class _10789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < test; i++) {
			int count[] = new int[62];
			char[] arr = sc.nextLine().toCharArray();
			for (int j = 0; j < arr.length; j++) {
				int ascii = (int) arr[j];
				if (ascii >= 48 && ascii <= 57) {
					count[ascii - 48]++;
				}
				if (ascii >= 65 && ascii <= 90) {
					count[ascii - 55]++;
				}
				if (ascii >= 97 && ascii <= 122) {
					count[ascii - 61]++;
				}
			}
			String result = "";
			for (int j = 0; j < count.length; j++) {
				if (count[j] > 1 && isPrime(count[j])) {
					if (j >= 0 && j <= 9) {
						result = result + (char) (j + 48);
					} else if (j >= 10 && j <= 35) {
						result = result + (char) (j + 55);
					} else if (j >= 36 && j <= 61) {
						result = result + (char) (j + 61);
					}
				}
			}
			if (result.equals("")) {
				result = "empty";
			}
			System.out.println("Case " + (i + 1) + ": " + result);
		}
		sc.close();
	}

	public static boolean isPrime(int n) {
		if (n == 2) {
			return true;
		}
		if (n % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i <= n; i = i + 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
