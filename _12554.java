package me.mukla.acm;

import java.util.Scanner;

class _12554 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] song = { "Happy", "birthday", "to", "you", "Happy",
				"birthday", "to", "you", "Happy", "birthday", "to", "Rujia",
				"Happy", "birthday", "to", "you" };
		String[] name = new String[n];
		for (int i = 0; i < n; i++) {
			name[i] = sc.nextLine();
		}

		int round = n / 16;
		if (n % 16 != 0) {
			round = round + 1;
		}
		int counter = 0;
		for (int i = 0; i < round; i++) {
			for (int j = 0; j < song.length; j++) {
				System.out.println(name[counter % n] + ": " + song[j]);
				counter++;
			}
		}

		sc.close();
	}
}
