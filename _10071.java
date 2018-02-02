package solution.acm.uva;

import java.util.Scanner;

public class _10071 {
	
	public static long velocity;
	public static long time;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			velocity = sc.nextLong();
			time = sc.nextLong();
			System.out.println((2*velocity*time));
		}
		sc.close();
	}

}
