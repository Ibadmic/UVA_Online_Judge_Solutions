package solution.acm.uva;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _100 {
	public static long lowerLimit;
	public static long upperLimit;
	public static long maxCycleLength;
	public static long currentLength;
	
	
	public static long getMaxCyclength(long lowerLimit, long upperLimit){
		maxCycleLength = 1;
	
		
		for(long i = lowerLimit; i<= upperLimit; i++){				
			long j= i;
			currentLength = 1;
			while(j != 1){
				if(j %2 == 0){
					j = j/2;
				}
				else{
					j = (j*3)+1;
				}
				currentLength++;
			}
			maxCycleLength = Math.max(maxCycleLength, currentLength);
		}
		
			
		
		
		return maxCycleLength;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st;

		while(sc.hasNext()){
			st = new StringTokenizer(sc.nextLine());
			lowerLimit = Long.parseLong(st.nextToken());
			upperLimit = Long.parseLong(st.nextToken());
			if(lowerLimit > upperLimit){
				long temp = lowerLimit;
				lowerLimit = upperLimit;
				upperLimit = temp;
				System.out.println(upperLimit+" "+ lowerLimit+" "+getMaxCyclength(lowerLimit, upperLimit));
			}
			else
			System.out.println(lowerLimit+" "+ upperLimit+" "+getMaxCyclength(lowerLimit, upperLimit));
		}
		sc.close();
	}
}
