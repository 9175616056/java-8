 package queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		
		Queue<Integer>q=new LinkedList<>();
		q.add(null);
		q.add(4);
		q.add(1);
		q.add(2);
		q.add(null);
		//q.remove();//it remove the first inserted value
	System.out.println(q);
	
//		q.clear();
		//System.out.println(q.poll());//print the firsst element or null value
		System.out.println(q.element());//it give the first element right
	System.out.println(q.peek());//it gives the null element if it is null
	}
}
