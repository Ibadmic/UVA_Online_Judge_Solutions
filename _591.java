package me.mukla.acm;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _591 {

	private static int colomnCounter = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int stacks = Integer.parseInt(sc.nextLine());
			if (stacks == 0)
				break;
			colomnCounter++;
			

			String inputSet = sc.nextLine();
			StringTokenizer st = new StringTokenizer(inputSet);
			int sum = 0;
			String[] inputArray = inputSet.split("\\s+");
			while (st.hasMoreTokens()) {
				sum += Integer.parseInt(st.nextToken());
			}
			int average = sum / stacks;
			int minimumMovement = 0;
			for (int i = 0; i < inputArray.length; i++) {
				if (Integer.parseInt(inputArray[i]) > average)
					minimumMovement += (Integer.parseInt(inputArray[i]) - average);

			}
			System.out.println("Set #" + colomnCounter);
			System.out.println("The minimum number of moves is " + minimumMovement + ".");
			System.out.println("");
		}

		sc.close();
	}
}
