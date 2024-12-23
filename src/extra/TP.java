package extra;

public class TP extends Thread {

     private String name;	

	TP(String name){
		this.name=name;
	}
	public static void main(String[] args) {
		
		TP t=new TP("XXXX");
		TP t2=new TP("ZZZZ");
		
		t.setName("addAmount");
		t2.setName("withdrawAmount");
		
		System.out.println(t.getName());
		System.out.println(t2.getName());
		
		t.start();
		t2.start();
	}
	public void run() {
		System.out.println(this.name);
	}
}
