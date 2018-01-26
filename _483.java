package me.mukla.acm;

import java.util.Scanner;

class _483 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.nextLine();
			String result = "";
			char[] chars = input.toCharArray();

			int start = 0, end = 0;
			boolean isFirst = true;
			for (int i = 0; i < chars.length; i++) {
				if (chars[i] == ' ' || i == chars.length - 1) {
					end = i - 1;
					if (i == chars.length - 1) {
						end++;
					}
					if (isFirst) {
						result = result + reverse(start, end, chars);
						isFirst = false;
					} else {
						result = result + " " + reverse(start, end, chars);
					}

					start = end + 2;
				}
			}

			System.out.println(result);
		}
		sc.close();
	}

	public static String reverse(int start, int end, char[] chars) {
		String result = "";
		for (int i = end; i >= start; i--) {
			result = result + chars[i];
		}
		
		return result;
	}

}
