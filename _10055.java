package solution.acm.uva;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _10055 {
	public static long hasmatsArmy;
	public static long hasmatsOponent;
	
	public static long getDifference(long x, long y){
		return Math.abs(x - y);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st;
		
		while(sc.hasNext()){
			st = new StringTokenizer(sc.nextLine());
			hasmatsArmy = Long.parseLong(st.nextToken());
			hasmatsOponent = Long.parseLong(st.nextToken());
			
			System.out.println(getDifference(hasmatsArmy, hasmatsOponent));
		}
		sc.close();
	}
}
