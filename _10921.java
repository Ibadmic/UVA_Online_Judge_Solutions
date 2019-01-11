package me.mukla.acm;

import java.util.Scanner;

class _10921 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.nextLine();
			char[] arr = input.toCharArray();
			String result = "";
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == '-' || arr[i] == '0' || arr[i] == '1') {
					result = result + arr[i];
				} else {
					int value = (int) arr[i] - 64;
					if (value <= 18) {
						for (int j = 1; j <= 6; j++) {
							if (value <= j * 3) {
								result = result + (j + 1);
								break;
							}
						}
					} else {
						if (value == 19) {
							result = result + 7;
						} else if (value >= 20 && value <= 22) {
							result = result + 8;
						} else {
							result = result + 9;
						}
					}
				}

			}
			System.out.println(result);
		}
		sc.close();
	}
}
