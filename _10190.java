package me.mukla.acm;

import java.util.Scanner;

class _10190 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String inputString = sc.nextLine();
			String[] values = inputString.split("\\s+");
			long n = Long.parseLong(values[0]);
			long m = Long.parseLong(values[1]);

			long prev = n;
			if (n <= 1 || n < m || m <= 1) {
				System.out.println("Boring!");
				continue;
			}

			String result = n + "";
			boolean isBoring = false;

			while (n > 1) {
				if ((n % m) != 0) {
					isBoring = true;
					break;
				}
				prev = n;
				n /= m;
				if (n == 0) {
					isBoring = true;
					break;
				} else if (prev % n != 0) {
					isBoring = true;
					break;
				}
				result = result + " " + n;
			}

			if (isBoring) {
				System.out.println("Boring!");
			} else {
				System.out.println(result);
			}

		}

		sc.close();
	}

}
