package logicalquestions.p;

import java.util.Random;

public class Randomnumber {

	public static void main(String[] args) {
		
		int number;
		Random r=new Random();
		number =r.nextInt(5);
		System.out.println(" generating :"+ number);
	}
}
