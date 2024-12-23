import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
//		List<Integer> lists = Arrays.asList(1,2,4,5,6,7);
//		
//		functional oodCharacter = list -> list % 2 !=0;
//		
//		lists.stream().filter(oodCharacter::isood)
//		.forEach(System.out::println);
		
		List<Integer>lis=Arrays.asList(9,8,7,6,5);
		functional oddcharacter=list->list %2==0;
		
		lis.stream().filter(oddcharacter::isood)
		.forEach(System.out::println);
		}
}
