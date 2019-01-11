package me.mukla.acm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11428 {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean found;
		int x = Integer.parseInt(br.readLine());
		while (x != 0) {
			found = false;
			for (int i = 2; i < x; i++) {
				for (int j = i - 1; j > 0; j--) {
					if ((i * i * i - j * j * j) == x) {
						System.out.println(i + " " + j);
						found = true;
						break;
					} else if ((i * i * i - j * j * j) > x) {
						if (i - j == 1) {
							found = true;
							System.out.println("No solution");
						}
						break;
					}
				}
				if (found) {
					break;
				}
			}
			x = Integer.parseInt(br.readLine());
		}
	}
}
