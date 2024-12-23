package collection;

public class polymmorphism2 extends polymorphism1 {

	public void test() {
		System.out.println(111);
	}
	public void test2() {
		System.out.println(222);
	}
	public static void main(String[] args) {
		polymmorphism2 p=new polymmorphism2();
		p.test();
		p.test2();
	}
}
