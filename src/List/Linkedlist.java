package List;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist{
	
	public static void main(String[] args) {
		
		LinkedList<Integer>l= new LinkedList<Integer>();
		
		l.add(2);
		l.add(3);
		l.add(null);
		l.add(null);
		System.out.println(l);
		
		Iterator i= l. iterator();
		while(i.hasNext()) {
			l.add(99);
			System.out.println(i.next());
		}
		if(l.contains(2)) {
			System.out.println("yes");
		}else
			System.out.println("no");
	}
}