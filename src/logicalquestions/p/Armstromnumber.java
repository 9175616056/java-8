package logicalquestions.p;

import java.util.Scanner;

public class Armstromnumber {

	public static void main(String[] args) {
		
		int n=153, arm=0, c, rem; //you find the cube of every single number
//		System.out.println("enter term");
//		   Scanner r= new Scanner(System.in);
//		   n=r.nextInt();                            //and their sum is equal to 153 is called 
		c=n;
		while (n>0) {   //   153/10   rem=6, n=15
			rem=n%10;//we find the reminder
			arm=(rem*rem*rem)+arm;//0multiply three times reminder variable i got cube and add with arm varaible and store into arm variable
			n=n/10;// divide this number into ten
		}
		if(c==arm) {
			System.out.println("armstrom Number");
		}else
			System.out.println("not armstrom Number");
		
	}
}
