package me.mukla.acm;

import java.util.Scanner;

class _11219 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			
			sc.nextLine();
			String current = sc.nextLine();
			String birth = sc.nextLine();

			String[] c = current.split("/");
			String[] b = birth.split("/");

			int diff = 0;

			boolean isCarry = false;
			for (int j = 0; j < 3; j++) {

				int x = Integer.parseInt(c[j]);
				int y = Integer.parseInt(b[j]);
				if (isCarry) {
					y = y + 1;
					isCarry = false;
				}
				if (x < y && j < 2) {
					if (j == 0) {
						x = x + 30;
					}
					if (j == 1 + 12) {
						x = x + 12;
					}

					isCarry = true;
				}
				diff = x - y;
			}
			if (diff < 0) {
				System.out.println("Case #" + (i + 1) + ": Invalid birth date");
			} else if (diff > 130) {
				System.out.println("Case #" + (i + 1) + ": Check birth date");
			} else {
				System.out.println("Case #" + (i + 1) + ": " + diff);
			}
		}
		sc.close();
	}
}
