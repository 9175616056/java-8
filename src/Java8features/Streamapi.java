package Java8features;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streamapi {

	public static void main(String[] args) {

	// List<Integer> list1=List.of(2,3,4,56,55);
		
		
		
		
		
//		List<String>names=list.of("rohan","aman","akash");//for printing A value character
//		List <String> s=names.stream().filter(e-> e.startsWith("A")).collect(Collectors.toList());
//       System.out.println(s);
		
		//	
	// List<Integer> s=list1.stream().filter(i->i>2).collect(Collectors.toList());//for greater than 2number
//	Stream<Object>emptystream=Stream.empty();//for printing empty stream
//	emptystream.forEach(e->{System.out.println(e);});
//	
//	String[]s={"rohan","awale","family"};//for printing one by one element
//	Stream<String>stream1=Stream.of(s);
//	stream1.forEach(e->{System.out.println(e);});
		
		IntStream stream=Arrays.stream(new int[] {1,2,3,4,4,5});
		stream.forEach(e->{System.out.println(e);});//for printing one by one integer

		
//	
	}
}
 