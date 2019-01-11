package me.mukla.acm;

import java.util.Scanner;

class _12592 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] key = new String[n];
		String[] value = new String[n];
		for (int i = 0; i < n; i++) {
			key[i] = sc.nextLine();
			value[i] = sc.nextLine();
		}

		int q = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < q; i++) {
			String query = sc.nextLine();
			for (int j = 0; j < key.length; j++) {
				if (key[j].equals(query)) {
					System.out.println(value[j]);
					break;
				}
			}
		}
		sc.close();
	}
}
