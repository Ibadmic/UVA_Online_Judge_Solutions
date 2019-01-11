package me.mukla.acm;

import java.util.Scanner;

class _11734 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < test; i++) {
			String contestant = sc.nextLine();
			String judge = sc.nextLine();
			String result = "";

			if (judge.equals(contestant)) {
				System.out.println("Case " + (i + 1) + ": Yes");
			} else {
				for (int j = 0; j < contestant.length(); j++) {
					if (contestant.charAt(j) != ' ') {
						result = result + contestant.charAt(j);
					}
				}
				if (judge.equals(result)) {
					System.out.println("Case " + (i + 1)
							+ ": Output Format Error");
				} else {
					System.out.println("Case " + (i + 1) + ": Wrong Answer");
				}
			}
		}

		sc.close();
	}
}
