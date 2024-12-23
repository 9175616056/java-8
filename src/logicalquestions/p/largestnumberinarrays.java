package logicalquestions.p;

public class largestnumberinarrays {

	public static void main(String[] args) {
		
		int[]x= {1,8,2,8,3,7,4,4,2,5,6,7,7};
		int max;
		
		max=x[0];
		for (int i = 0; i < x.length; i++) {
			if(x[i]>max) {
				max=x[i];
			}
		}
		System.out.println(max);//for largest no.
		//System.out.println(max-1);//for second largest no.
	}
}
