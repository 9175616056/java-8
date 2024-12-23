
public class HowToPrintThreadName {

	public static void main(String[] args) {
		
		System.out.println("program is started");
		int x=56+34;
		System.out.println("sum is"+x);
		
		Thread t=Thread.currentThread();
		String tname=t.getName();
		System.out.println("Current running thread is " +  tname);
		t.setName("mymain");
		
		System.out.println(t.getName());
	}
}
