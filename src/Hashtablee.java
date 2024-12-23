 import java.util.Hashtable;
import java.util.Iterator;

public class Hashtablee {

	public static void main(String[] args) {
		
		Hashtable<Integer,String>x= new Hashtable<Integer,String>();
		
		x.put(1,"rohan");
		x.put(233,"awale");
		
		x.put(2,"sfsdfsds");
		
		System.out.println(x);
		Iterator itr= x.iterator();
	while(itr.hasNext());
		System.out.println(itr.next());
	}
}
