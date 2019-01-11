package me.mukla.acm;

import java.util.Scanner;

class _12468 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dif1, dif2;
		while (sc.hasNext()) {
			String input[] = sc.nextLine().split("\\s+");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);

			if (a == -1 || b == -1) {
				break;
			}
			dif1 = abs(a - b);
			dif2 = min(100 - a + b, 100 - b + a);

			System.out.println(min(dif1, dif2));

		}
		sc.close();
	}

	public static int abs(int x) {
		if (x < 0) {
			return -x;
		}
		return x;
	}

	public static int min(int x, int y) {
		if (x < y) {
			return x;
		}
		return y;
	}
}
