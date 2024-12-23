package logicalquestions.p;

import java.util.Arrays;

public class secondhigestnumber {

	public static void main(String[] args) {
		
		int []num= {9,8,7,6,5,4,9,88};
		int n= num.length;
		
		int highest=Integer.MIN_VALUE;
		int secondhighest=Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if(num[i]>highest) {
				secondhighest=highest;
				highest=num[i];
			}
			if(num[i]<highest && num[i]>secondhighest) {
			secondhighest=num[i];	
			}}
		//Arrays.sort(num);
		System.out.println(secondhighest);
		//System.out.println(num[n-3]);
		
	}
}
