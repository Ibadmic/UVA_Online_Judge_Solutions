package solution.acm.uva;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _11877 {
	
	public static int total_bottle;
	public static int no_of_bottle;
	
		
	
	public static int getTotalNoOfCigarate(int initial_no_of_bottle){
		
			no_of_bottle = initial_no_of_bottle;
			
			total_bottle = 0 ;
			while(no_of_bottle >= 2){
				
				if(no_of_bottle > 2){
					total_bottle += no_of_bottle/3;
					no_of_bottle = (no_of_bottle/3) + (no_of_bottle%3);
				}
				else if(no_of_bottle == 2){
					no_of_bottle = (no_of_bottle/3) + (no_of_bottle%3);
					total_bottle += 1;
					break;
				}
			}
			
			return total_bottle;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st;
		int n;
		while (sc.hasNext()) {
			
			st = new StringTokenizer(sc.nextLine());
			n = Integer.parseInt(st.nextToken());
			if(n == 0)
				break;
			else
			System.out.println(getTotalNoOfCigarate(n));
			
		}
		
	}
}
