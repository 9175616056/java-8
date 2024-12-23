package List;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	
public static void main(String[] args) {
	
	ArrayList x= new ArrayList();//it can accept all type data
	x.add(11);
	x.add(1); // <Integer>
	x.add(null);
	x.add(null);
	x.add("rohan");//ArrayList<String>x= new ArrayList<String>();
	x.add(10.3);
	x.add(new Integer(30));
	//*************
	//ArrayList<Integer>x= new ArrayList<Integer>(); //ans rohan():[11]
	                                                ///add(index value)method():[11, 300]
    x.add(10);
    x.add(20);
	x.add(30);         
	System.out.println("rohan():"+x);
	x.add(0,300);// where put value give number first
	System.out.println(x);
//**********************
	ArrayList<Integer>y= new ArrayList<Integer>();//add y value inside x
	y.add(200);
	y.add(300);
	x.addAll(2,y);
	System.out.println("last value:"+x);
	
	
	if(x.contains(200)) {   //for search element
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
	x.remove(0);//for removing
	System.out.println(x);
	
	Iterator itr= x.iterator();//for read the value arraylist
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}

}
