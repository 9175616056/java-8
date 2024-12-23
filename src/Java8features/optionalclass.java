package Java8features;

import java.util.Optional;

public class optionalclass {

	public static void main(String[] args) {
		
	String	str = null;//"rohan awale";
	Optional<String> O1 = Optional.of(str);//if value is null it throw nullpointerexception
//		Optional<String> O1 = Optional.ofNullable(str);
		System.out.println(O1.isPresent());//it is null output is false
		//in this present value it is true
		
		//System.out.println(O1.get());//it help us to extract the value
		//System.out.println(O1.orElse("no value"));//it give the value if it not there it print the ,msg
	}
}
