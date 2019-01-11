package me.mukla.acm;

import java.util.ArrayList;
import java.util.Scanner;

class _12015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			ArrayList<String> sites = new ArrayList<String>();
			int max = -1;
			for (int j = 0; j < 10; j++) {
				String[] input = sc.nextLine().split("\\s+");
				if (Integer.parseInt(input[1]) > max) {
					sites.clear();
					sites.add(input[0]);
					max = Integer.parseInt(input[1]);
				} else if (Integer.parseInt(input[1]) == max) {
					sites.add(input[0]);
				}
			}
			System.out.println("Case #" + (i + 1) + ":");
			for (String site : sites) {
				System.out.println(site);  
			}

		}
		sc.close();
	}
}
