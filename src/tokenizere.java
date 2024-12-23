import java.util.StringTokenizer;

public class tokenizere {

	public static void main(String[] args) {
		
		StringTokenizer str= new StringTokenizer("Pankaj Sir Academy");
		
		while(str.hasMoreTokens()) { //it help to all print
		System.out.println(str.nextToken());//it print only first word
		
//		int count=0;
//		StringTokenizer str= new StringTokenizer("Pankaj Sir Academy");
//		while(str.hasMoreTokens()) {
//			System.out.println(str.nextToken());
//			count++;
//			
//	}
//		System.out.println(count++);//count the word
}
}}