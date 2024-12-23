package dumy;

import java.util.Arrays;

public class dumy {
	
	public static void main(String[] args) {
		dumy1 d=new dumy1();
		d.setId(111);
		int x=d.getId();
		
		d.setName("rohan");
		String s=d.getName();
		
		System.out.println(x);
		System.out.println(s);
	}
}