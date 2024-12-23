package extra;

public class an implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i<10 ; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
		}
	}
	public static void main(String[] args) {
		an a=new an();
		Thread t=new Thread(a);
		
		T t2=new T();
		t.start();
		t2.start();
	}

}
