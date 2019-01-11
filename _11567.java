package me.mukla.acm;

import java.util.Scanner;

class _11567 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			long n = Long.parseLong(sc.nextLine());

			int counter = 0;

			while (n > 0) {
				if (n == 1) {
					counter++;
					n = 0;
				} else if (n % 2 == 0) {
					n /= 2;
					counter++;
				} else if(n == 3){
					n = 0;
					counter +=3;
				}else {
					long a = (n - 1) / 2;
					if (a % 2 == 0) {
						n = n - 1;
					} else {
						n = n + 1;
					}
					counter++;
				}

			}
			System.out.println(counter);
		}
		sc.close();
	}
}
