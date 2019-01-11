package me.mukla.acm;

import java.util.Scanner;

class _11172 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int inputSize = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < inputSize; i++) {
				String inputSet = sc.nextLine();

				String[] inputArray = inputSet.split("\\s+");

				long first = Long.parseLong(inputArray[0]);
				long second = Long.parseLong(inputArray[1]);

				if (first > second) {
					System.out.println(">");
				}else if (first < second) {
					System.out.println("<");
				}else{
					System.out.println("=");
				}

			}
		}
		sc.close();
	}

}
