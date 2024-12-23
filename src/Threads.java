
public class Threads extends Thread {

	//int x=2;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
public static void main(String[] args) {
	
	Threads t=new Threads();
	
    t.start();;
}
}