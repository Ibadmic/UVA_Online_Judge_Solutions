package solution.acm.uva;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _494 {
	private static String inpusString;
	private static String parseString;
	
	private static int countWords(String inputString, String parseString){
		
		int counter = 0;
		StringTokenizer st = new StringTokenizer(inputString, parseString);
		while(st.hasMoreTokens()){
		    st.nextToken();
			counter++;
		}
		return counter;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			inpusString = sc.nextLine();
			parseString = "";
			for(int i = 0; i < inpusString.length(); i++){
				Character ch = inpusString.charAt(i);
				if(!ch.isLetter(ch)){
					parseString += ch;
				}
			}
			System.out.println(countWords(inpusString, parseString));
		}
		sc.close();
	}

}
