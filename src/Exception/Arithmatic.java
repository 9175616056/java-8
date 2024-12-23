package Exception;

public class Arithmatic {
	
	public static void main(String[] args) {
		
	
//     try {
//	     int x=11;
//	     int y=0;
//	     int z=y/x;
//
//	System.out.println(z);
//	
//    }catch(ArithmeticException e) {
//    	e.printStackTrace();
//    }
//     System.out.println(100); 
//    }
		try {
			int x=11;
			int y=0;
			int z=x/y;
			System.out.println(z);
		
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
//		System.out.println(100);
	}
}

