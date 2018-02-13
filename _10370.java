package me.mukla.acm;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

class _10370 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int testCases = sc.nextInt();

			for (int i = 0; i < testCases; i++) {
				int numberOfStudents = sc.nextInt();
				float[] marks = new float[numberOfStudents];
				float totalMarks = 0;
				for (int j = 0; j < numberOfStudents; j++) {
					float n = sc.nextFloat();
					totalMarks += n;
					marks[j] = n;
				}
				float avg = totalMarks / numberOfStudents;
				
				float aboveAvg = 0;
				for (int j = 0; j < numberOfStudents; j++) {
					
					if (marks[j] > avg) {
						aboveAvg++;
					}
				}
				float result = aboveAvg / (float)numberOfStudents * 100;
				NumberFormat formatter = new DecimalFormat("#0.000");
				String r = formatter.format(result);
				System.out.println(r+"%");
			}
		}
		sc.close();
	}
}
