package me.mukla.acm;

import java.util.HashMap;
import java.util.Scanner;

class _12250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("HELLO", "ENGLISH");
		map.put("HOLA", "SPANISH");
		map.put("HALLO", "GERMAN");
		map.put("BONJOUR", "FRENCH");
		map.put("CIAO", "ITALIAN");
		map.put("ZDRAVSTVUJTE", "RUSSIAN");
		int index = 1;
		while (sc.hasNext()) {
			String input = sc.nextLine();
			if (input.equals("#")) {
				break;
			}
			String result = map.get(input);
			if (result == null) {
				System.out.println("Case " + (index++) + ": " + "UNKNOWN");
			} else {
				System.out.println("Case " + (index++) + ": " + result);
			}
		}
		sc.close();
	}
}
