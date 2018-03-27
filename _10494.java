package solution.acm.uva;

import java.math.BigInteger;
import java.util.Scanner;

public class _10494 {
	public static BigInteger input1;
	public static BigInteger input2;
	public static String operator;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			 input1 = sc.nextBigInteger();
			 operator = sc.next();
			 input2 = sc.nextBigInteger();
			 
			 if(operator.equals("/")){
				 System.out.println(input1.divide(input2));
			 }
			 
			 else if(operator.equals("%")) {
				 System.out.println(input1.mod(input2));
			 }
			sc.close();			
		}
	}

}
