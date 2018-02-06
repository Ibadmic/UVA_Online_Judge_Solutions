package solution.acm.uva;

import java.math.BigInteger;
import java.util.Scanner;

public class _10106 {
	public static BigInteger input1;
	public static BigInteger input2;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while (sc.hasNext()){
			BigInteger input = sc.nextBigInteger();
			
			if( i % 2 == 1){
				input1 = input;
				i++;
			}
			else if( i % 2 == 0){
				input2 = input;
				System.out.println((input1.multiply(input2)));
				i++;
			}
			
		}
		sc.close();
	}

}
