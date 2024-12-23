import java.util.ArrayList;
import java.util.Collections;

public class comparator {

     public static void main(String[] args) {
		
		ArrayList<comparators>l=new ArrayList<>();
		
		l.add(new comparators("rohan","948",15));
		l.add(new comparators("rohit","144",13));
		l.add(new comparators("r","328",14));
		
		System.out.println(l);
		Collections.sort(l,new Idcomparator());
		System.out.println(l);
		
		ArrayList<comparators>l1=new ArrayList<>(l);
		Collections.sort(l1,new namecomparator());
		System.out.println(l1);
	}
}
