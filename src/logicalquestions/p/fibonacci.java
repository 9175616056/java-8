package logicalquestions.p;

import java.util.Scanner;

public class fibonacci {

   public static void main(String[] args) {
	//first two element are added and get third number, its start from 0,1;
	   int term, a=0, b=1,c;//put the number where to till print the series, a=0 b=1 is starting number, c is help us to add last two number and add
	   System.out.println("enter term");
	   Scanner r= new Scanner(System.in);
	term=r.nextInt();
	   
	   for (int i = 0; i <=term; i++) {//it start from 1 and ended with what given in input
	    System.out.print(a+" ");
		c=a+b;
		a=b;
		b=c;
	}
}
}
