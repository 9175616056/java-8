
public class defaultconstructor {
    
	int x;
	String s;
	boolean b;
	 
	defaultconstructor(){
		x=99;s="rohan";b=true;
		
	}
	void test() {
		System.out.println(x+""+s+""+b+"");
	}
	public static void main(String[] args) {
		defaultconstructor d=new defaultconstructor();
		d.test();
	}
}