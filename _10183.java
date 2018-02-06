package me.mukla.acm;

import java.math.BigInteger;
import java.util.Scanner;

class _10183 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int index = 1;
		BigInteger[] arr = new BigInteger[100000000];
		arr[0] = BigInteger.ONE;
		arr[1] = arr[0].add(BigInteger.ONE);
		BigInteger max = arr[1];
		while (sc.hasNext()) {
			String[] input = sc.nextLine().split("\\s+");

			BigInteger a = new BigInteger(input[0]);
			BigInteger b = new BigInteger(input[1]);

			if (a.equals(BigInteger.ZERO) && b.equals(BigInteger.ZERO)) {
				break;
			}
			if (max.compareTo(b) < 0) {
				while (true) {
					BigInteger x = arr[index].add(arr[index - 1]);
					if (x.compareTo(b) > 0) {
						break;
					}
					arr[index + 1] = x;
					index++;
				}
				max = b;
			}
			
			int counter = 0;
			for (int i = 0; i <= index; i++) {
				
				if (arr[i].compareTo(a) >= 0 && arr[i].compareTo(b) <= 0) {
					counter++;
				}
				if (arr[i].compareTo(b) > 0) {
					break;
				}
			}
			System.out.println(counter);
		}
		sc.close();
	}

}
