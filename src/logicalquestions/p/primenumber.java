package logicalquestions.p;

import java.util.Scanner;

public class primenumber {
//this no. only divided by one and only this number
	public static void main(String[] args) {
		int n=9; int count=0;
//		System.out.println("enter term");
//		   Scanner r= new Scanner(System.in);
//		   n=r.nextInt();
		for (int i = 1; i <=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime");
		}else
			System.out.println("not prime");
		}
	}

