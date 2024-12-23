package collection;

public class interface1 implements interface12 {

//	@Override
//	public void test() {
//	System.out.println(11);	
//		
//	}
//
//	@Override
//	public void test1() {
//	System.out.println(122);	
//		
//	}
//public static void main(String[] args) {
//	
//	interface1 i=new interface1();
//	i.test();
//	i.test1();
//	
//}
//	
	public void test() {
		System.out.println(11);
	}
	public void test1() {
		System.out.println(22);
	}
	public static void main(String[] args) {
		interface1 i=new interface1();
		i.test();
		i.test1();
}
}