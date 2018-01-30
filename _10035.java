package me.mukla.acm;

import java.util.Scanner;

class _10035 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String inputSet = sc.nextLine();
			String[] values = inputSet.split("\\s+");
			long first = Long.parseLong(values[0]);
			long second = Long.parseLong(values[1]);

			if (first == 0 && second == 0) {
				break;
			}

			int c = getCarry(first, second);
			if (c == 0) {
				System.out.println("No carry operation.");
			} else if (c == 1) {
				System.out.println("1 carry operation.");
			} else {
				System.out.println(c + " carry operations.");
			}
		}
		sc.close();
	}

	public static int getCarry(long x, long y) {
		int carryCounter = 0, carry = 0;
		while (true) {
			if (x == 0 && y == 0)
				break;

			long digitX = x % 10;
			long digitY = y % 10;

			if (digitX + digitY + carry >= 10) {
				carryCounter += 1;
				carry = 1;
			} else {
				carry = 0;
			}

			x /= 10;
			y /= 10;
		}
		return carryCounter;
	}
}
