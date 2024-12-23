package Exception;

public class numberformat {

	public static void main(String[] args) {
		
		try {
			String x="rohan";
			int val1=Integer.parseInt(x);
			System.out.println(val1);
			
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		}
		System.out.println(100);
	}
}
