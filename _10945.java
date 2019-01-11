package me.mukla.acm;

import java.util.Scanner;

class _10945 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();

			if (str.equals("DONE")) {
				break;
			}
			String s = str.toUpperCase();
			String org = "", reverse = "";
			for (int i = 0; i < s.length(); i++) {
				if (Character.isAlphabetic(s.charAt(i))) {
					org = org + s.charAt(i);
				}
				;
			}
			for (int i = org.length() - 1; i >= 0; i--)
				reverse = reverse + org.charAt(i);

			if (org.equals(reverse)) {
				System.out.println("You won't be eaten!");
			} else {
				System.out.println("Uh oh..");
			}

		}
		sc.close();
	}
}
