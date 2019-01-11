package me.mukla.acm;

import java.util.Scanner;

class _11636 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			if (n < 0) {
				break;
			}
			int p = binlog(n);
			
			if (Math.pow(2, p) < n) {
				System.out.println("Case " + (i++) + ": " + (p + 1));
			} else {
				System.out.println("Case " + (i++) + ": " + p);
			}

		}
		sc.close();
	}

	public static int binlog(int bits) {
		int log = 0;
		if ((bits & 0xffff0000) != 0) {
			bits >>>= 16;
			log = 16;
		}
		if (bits >= 256) {
			bits >>>= 8;
			log += 8;
		}
		if (bits >= 16) {
			bits >>>= 4;
			log += 4;
		}
		if (bits >= 4) {
			bits >>>= 2;
			log += 2;
		}
		return log + (bits >>> 1);
	}
}
