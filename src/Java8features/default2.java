package Java8features;

public class default2 implements default1 {

	@Override
	public void test() {
System.out.println(133);		
	}
public static void main(String[] args) {
	default2 d=new default2();
		d.test();
		d.test2();
		d.test3();
	}
}

