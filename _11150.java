package solution.acm.uva;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _11150 {
	
	public static int total_bottol;
	public static int no_of_bottol;
	
		
	
	public static int getTotalNoOfCigarate(int initial_no_of_cigarate){
		
			no_of_bottol = initial_no_of_cigarate;
			
			total_bottol = no_of_bottol ;
			while(no_of_bottol >= 2){
				
				if(no_of_bottol > 2){
					total_bottol += no_of_bottol/3;
					no_of_bottol = (no_of_bottol/3) + (no_of_bottol%3);
				}
				else if(no_of_bottol == 2){
					no_of_bottol = (no_of_bottol/3) + (no_of_bottol%3);
					total_bottol += 1;
					break;
				}
			}
			
			return total_bottol;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st;
		int n;
		while (sc.hasNext()) {
			
			st = new StringTokenizer(sc.nextLine());
			n = Integer.parseInt(st.nextToken());
			
			System.out.println(getTotalNoOfCigarate(n));
			
		}
		
	}
}
