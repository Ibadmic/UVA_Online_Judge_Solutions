package solution.acm.uva;

import java.util.Scanner;

public class _11547 {
	public static long input;
	public static int testCase;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			testCase = sc.nextInt();
			
			for(int i =0; i < testCase ; i++){
				input = sc.nextLong();
				input *= 567;
				input /= 9;
				input += 7492;
				input *= 235;
				input /= 47;
				input -= 498;
				
				String resultString = String.valueOf(input);
				System.out.println(resultString.charAt(resultString.length()-2));
				
			}
		}
		sc.close();
	}

}
