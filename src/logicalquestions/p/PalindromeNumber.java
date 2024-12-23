package logicalquestions.p;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int n=121, s=0, c, rem; //If you count in front, 121
//		System.out.println("enter term");
//		   Scanner r= new Scanner(System.in);
//		   n=r.nextInt();                       //if you count backwards, it will remain the same.
		c=n;
		while(n>0) {
			rem=n%10;
			s=(s*10)+rem;
			n=n/10;
		}if(c==s) {
			System.out.println("Palindrome Number");
		}else
			System.out.println("not Palindrome Number");
	}
}
