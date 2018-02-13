package solution.acm.uva;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _10346 {
	
	public long k;
	public long total_cigarate;
	public long no_of_buts;
	
	
	
	public  long getTotalNoOfCigarate(long initial_no_of_cigarate , long limit){
		
			no_of_buts = initial_no_of_cigarate;
			k = limit;
			total_cigarate = initial_no_of_cigarate;
			while(no_of_buts >= k && k > 1){
				total_cigarate += no_of_buts/k;
				no_of_buts = (no_of_buts/k) + (no_of_buts%k); 
			}
			
			return total_cigarate;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		_10346 ob = new _10346();
		
		StringTokenizer st;
		long n,k;
		while (sc.hasNext()) {
			
			st = new StringTokenizer(sc.nextLine());
			
			n = Long.parseLong(st.nextToken());
			k = Long.parseLong(st.nextToken());
			
			
			System.out.println(ob.getTotalNoOfCigarate(n, k));
			
		}
		sc.close();
		
	}
}
