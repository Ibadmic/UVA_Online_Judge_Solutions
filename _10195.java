package me.mukla.acm;

import java.util.Scanner;

class _10195 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] input = sc.nextLine().split("\\s+");
			double a = Double.parseDouble(input[0]);
			double b = Double.parseDouble(input[1]);
			double c = Double.parseDouble(input[2]);

			if (a == 0 && b == 0 && c == 0) {
				System.out.println("The radius of the round table is: 0.000");
				continue;
			}
			double s = (a + b + c) / 2;
			double area = Math.sqrt(((s - a) * (s - b) * (s - c)) / s);

			System.out.printf("The radius of the round table is: " + "%.3f",
					area);
			System.out.println();
		}
		sc.close();
	}
}
