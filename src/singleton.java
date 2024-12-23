
public class singleton {

	public static void main(String[] args) {
		
		singleton1 s2=singleton1.getInstance();
		System.out.println(s2);
		singleton1 s3=singleton1.getInstance();
		System.out.println(s3);
	}
}
