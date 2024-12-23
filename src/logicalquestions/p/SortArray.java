package logicalquestions.p;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		
		int x[]= {9,8,7};
		int temp=0;
//		Scanner s= new Scanner(System.in);
//		System.out.println("enter the vavlue");
		
//		for (int i = 0; i < 5; i++) {
//			//x[i]=s.nextInt();
//		}
		for (int i = 0; i < x.length; i++) {
		for (int j = i+1; j < x.length; j++) {
			if(x[i]>x[j]) {
				
				temp=x[i];
				x[i]=x[j];
				x[j]=temp;
			}	
		}	
		}
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
}
