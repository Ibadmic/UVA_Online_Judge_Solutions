package me.mukla.acm;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _113 {

	private static int counter = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String inputString = sc.nextLine();
			String resultString = "";
			for (int i = 0; i < inputString.length(); i++) {
				if (inputString.charAt(i) == '"') {
					if (counter % 2 == 0)
						resultString += "``";
					else
						resultString += "''";
					counter++;
				} else {
					resultString += inputString.charAt(i);
				}
			}
			System.out.println(resultString);
		}

		sc.close();
	}
}
