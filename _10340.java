package me.mukla.acm;

import java.util.Scanner;

class _10340 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String orginal = sc.next();
			String encrypted = sc.next();

			char[] org = orginal.toCharArray();
			char[] enc = encrypted.toCharArray();
			if (enc.length < org.length) {
				System.out.println("No");
				continue;
			}
			int index = 0;
			boolean match = true;

			for (int i = 0; i < org.length; i++) {
				if (!match) {
					break;
				}
				char c = org[i];

				for (int j = index; j < enc.length; j++) {
					if ((enc.length - j) < (org.length - i)) {
						match = false;
						index = j + 1;
						break;
					}
					if (enc[j] == c) {
						index = j + 1;
						break;
					}
					index = j + 1;
					if (index >= enc.length) {
						match = false;
					}
				}
			}
			if (match) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		sc.close();
	}
}
