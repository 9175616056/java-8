package logicalquestions.p;

import java.util.Scanner;

public class Factorialnumber {

	public static void main(String[] args) {
		
		int n=5 , fact=1;
//		System.out.println("enter the number");
//		Scanner r= new Scanner(System.in);
//		n=r.nextInt();
		for (int i = 1; i <=n; i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
