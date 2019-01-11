package me.mukla.acm;

import java.util.HashMap;
import java.util.Scanner;

class _11233 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.nextLine();
			String[] arr = input.split("\\s+");
			int l = Integer.parseInt(arr[0]);
			int n = Integer.parseInt(arr[1]);

			HashMap<String, String> map = new HashMap<String, String>();
			for (int i = 0; i < l; i++) {
				String data = sc.nextLine();
				String[] a = data.split("\\s+");
				map.put(a[0], a[1]);
			}
			for (int i = 0; i < n; i++) {
				String testData = sc.nextLine();
				if (map.containsKey(testData)) {
					System.out.println(map.get(testData));
				} else if (testData.charAt(testData.length() - 1) == 'y'
						&& testData.length() >= 2) {
					if (!isVowel(testData.charAt(testData.length() - 2))) {
						System.out.println(testData.substring(0,
								testData.length() - 1)
								+ "ies");

					} else {
						System.out.println(testData + "s");
					}

				} else if (endsWith(testData)) {
					System.out.println(testData + "es");
				} else {
					System.out.println(testData + "s");
				}
			}
		}
		sc.close();
	}

	public static boolean endsWith(String ex) {
		char last = ex.charAt(ex.length() - 1);

		if (last == 'o' || last == 's' || last == 'x') {
			return true;
		}
		if (ex.length() >= 2) {
			String s = ex.substring(ex.length() - 2);
			if (s.equals("ch") || s.equals("sh")) {
				return true;
			}
		}
		return false;
	}

	public static boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		}
		return false;
	}
}
