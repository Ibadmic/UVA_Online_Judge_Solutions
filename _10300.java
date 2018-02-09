package me.mukla.acm;

import java.util.Scanner;

class _10300 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int inputSize = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < inputSize; i++) {
				int farmers = Integer.parseInt(sc.nextLine());
				float totalCost = 0;
				for (int j = 0; j < farmers; j++) {
					String info = sc.nextLine();
					String[] paramaters = info.split("\\s+");

					float squreFeetPerAnimal = Float.parseFloat(paramaters[0])
							/ Float.parseFloat(paramaters[1]);
					float unitCost = squreFeetPerAnimal
							* Float.parseFloat(paramaters[2]);
					float tCost = unitCost * Float.parseFloat(paramaters[1]);
					totalCost += tCost;

				}
				System.out.println((int)totalCost);

			}
		}
		sc.close();
	}
}
