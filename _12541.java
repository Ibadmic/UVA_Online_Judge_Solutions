package me.mukla.acm;

import java.util.Scanner;

class _12541 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String younger = "";
		String oldest = "";
		int[] ageYounger = new int[3];
		int[] ageOldest = new int[3];
		for (int i = 0; i < n; i++) {
			String[] input = sc.nextLine().split("\\s+");
			int year = Integer.parseInt(input[3]);
			int month = Integer.parseInt(input[2]);
			int day = Integer.parseInt(input[1]);
			if (i == 0) {
				younger = input[0];
				oldest = input[0];
				ageYounger[0] = day;
				ageYounger[1] = month;
				ageYounger[2] = year;
				ageOldest[0] = day;
				ageOldest[1] = month;
				ageOldest[2] = year;
			} else {
				if (year >= ageOldest[2]) {
					if (year > ageOldest[2]) {
						oldest = input[0];
						ageOldest[0] = day;
						ageOldest[1] = month;
						ageOldest[2] = year;
					} else {
						if (month >= ageOldest[1]) {
							if (month > ageOldest[1]) {
								oldest = input[0];
								ageOldest[0] = day;
								ageOldest[1] = month;
								ageOldest[2] = year;
							} else {
								if (day > ageOldest[0]) {
									oldest = input[0];
									ageOldest[0] = day;
									ageOldest[1] = month;
									ageOldest[2] = year;
								}
							}
						}
					}
				}
				if (year <= ageYounger[2]) {
					if (year < ageYounger[2]) {
						younger = input[0];
						ageYounger[0] = day;
						ageYounger[1] = month;
						ageYounger[2] = year;
					} else {
						if (month <= ageYounger[1]) {
							if (month < ageOldest[1]) {
								younger = input[0];
								ageYounger[0] = day;
								ageYounger[1] = month;
								ageYounger[2] = year;
							} else {
								if (day < ageYounger[0]) {
									younger = input[0];
									ageYounger[0] = day;
									ageYounger[1] = month;
									ageYounger[2] = year;
								}
							}
						}
					}
				}
			}
		}

		System.out.println(oldest);
		System.out.println(younger);
		sc.close();
	}
}
