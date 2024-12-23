package Exception;

public class nullpointer {

	static nullpointer a1;
	 int x=12;
	
	public static void main(String[] args) {
		
		try {
			System.out.println(a1.x);
			
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		//System.out.println(100);
	}
}
