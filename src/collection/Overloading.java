package collection;

public class Overloading {

	public void test() {
		System.out.println(1);
	}
	public void test(int x) {
		System.out.println(x);
	}
	public static void main(String[] args) {
		Overloading o=new Overloading();
		o.test();
		o.test(11);
	}
}
