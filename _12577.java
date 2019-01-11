package me.mukla.acm;

import java.util.Scanner;

class _12577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index = 1;
		while (sc.hasNext()) {
			String input = sc.nextLine();
			if (input.equals("*")) {
				break;
			}
			if (input.equals("Hajj")) {
				System.out.println("Case " + (index++) + ": Hajj-e-Akbar");
			} else {
				System.out.println("Case " + (index++) + ": Hajj-e-Asghar");
			}
		}
		sc.close();
	}
}
