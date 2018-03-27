package me.mukla.acm;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

class _10424 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int n = Integer.parseInt(sc.nextLine());
			String countries[] = new String[n];
			for (int i = 0; i < n; i++) {
				String input = sc.nextLine();
				StringTokenizer st = new StringTokenizer(input);
				if (st.hasMoreTokens()) {
					countries[i] = st.nextToken();
				}
			}
			Arrays.sort(countries);
			
			int counter = 0;
			String prev = countries[0], current = "";
			for (int i = 0; i < countries.length; i++) {

				current = countries[i];

				if (current.equals(prev)) {
					counter++;
				} else {

					System.out.println(prev + " " + counter);
					prev = current;
					counter = 1;
				}
				if (i == countries.length - 1) {
					System.out.println(prev + " " + counter);
				}

			}
		}
		sc.close();
	}
}
