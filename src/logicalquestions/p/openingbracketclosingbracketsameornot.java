package logicalquestions.p;

import java.util.Scanner;

public class openingbracketclosingbracketsameornot {

	public static void main(String[] args) {
		String str="(((()))))";
//		Scanner scan = new Scanner(System.in);
//		System.out.println("(((())))");
//		String str = scan.next();
		
		int count1 =0;
		int count2 =0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)== '(') {
				count1++;
				
			}else if(str.charAt(i)==')') {
				count2++;
			}
		}if(count1== count2) {
			System.out.println("no error");
		}else {
			System.out.println("error");
		}
	}
}
