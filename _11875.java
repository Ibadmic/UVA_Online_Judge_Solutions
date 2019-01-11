package me.mukla.acm;

import java.util.Scanner;

class _11875 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int testCases = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < testCases; i++) {
				String input = sc.nextLine();
				String[] values = input.split("\\s+");
				
				int index = Integer.parseInt(values[0]) / 2;
				System.out.println("Case " + (i + 1) + ": " + values[index+1]);
			}
		}
		sc.close();
	}
}
