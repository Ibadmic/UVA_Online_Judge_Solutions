package me.mukla.acm;

import java.util.Scanner;

class _12503 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		for (int k = 0; k < test; k++) {
			int n = Integer.parseInt(sc.nextLine());
			int[] arr = new int[n];
			int p = 0;
			for (int i = 0; i < n; i++) {
				String input = sc.nextLine();
				if (input.charAt(0) == 'L') {
					arr[i] = -1;
					p -= 1;
				} else if (input.charAt(0) == 'R') {
					arr[i] = 1;
					p += 1;
				} else {
					String [] values = input.split("\\s+");
					int x = Integer.parseInt(values[2]);
					arr[i] = arr[x-1];
					p = p + arr[x - 1];
				}

			}
			System.out.println(p);
		}
		sc.close();
	}
}
