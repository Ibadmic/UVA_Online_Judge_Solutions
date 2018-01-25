package me.mukla.acm;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _113 {
	public static double n;
	public static double p;

	
	public static double getNthRoot(double n, double p){
		return Math.round(Math.pow(p,  1.0 / n));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st;

		while(sc.hasNext()){
			st = new StringTokenizer(sc.nextLine());
			n = Double.parseDouble(st.nextToken());
			st = new StringTokenizer(sc.nextLine());
			p = Double.parseDouble(st.nextToken());
			
			System.out.println((int)getNthRoot(n, p));
		}
		sc.close();
	}
}

