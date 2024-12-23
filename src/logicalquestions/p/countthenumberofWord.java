package logicalquestions.p;

public class countthenumberofWord {

	public static void main(String[] args) {
		
		String str = "Pankaj Sir Academy";
		String []s = str.trim().split(" ");
		
		System.out.println(str.length());
		
		for(String x : s) {
			System.out.println(x);
		}
	}
}
