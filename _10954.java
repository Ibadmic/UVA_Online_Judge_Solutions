package me.mukla.acm;

import java.util.PriorityQueue;
import java.util.Scanner;

public class _10954 {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		PriorityQueue<Integer> pq;
		int n, cost, total = 0;
		while ((n = in.nextInt()) != 0) {
			
			total = 0;
			pq = new PriorityQueue<Integer>();
			for (int i = 0; i < n; i++) {
				pq.add(in.nextInt());
			}
			while (pq.size() != 1) {
				cost = pq.poll() + pq.poll();
				total += cost;
				pq.add(cost);
			}
			System.out.println(total);

		}
		in.close();

	}

}
