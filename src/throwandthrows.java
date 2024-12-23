import logicalquestions.p.A;

public class throwandthrows {

	public void test(int a, int b) throws ArithmeticException{
		if(b==0) {
			throw new ArithmeticException();
		}else {
			int c=a/b;
		    System.out.println(c);
	}}
	public static void main(String[] args) {
		throwandthrows a=new throwandthrows();
		try {
			a.test(20, 0);
			
		} catch (Exception e) {
			System.out.println("Rohan Buddhabhagwan Awale");
		}
		
		}
	}

