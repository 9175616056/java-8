package extra;

public class T extends Thread{

	@Override
	public void run() {
		for (int i =10; i>=1; i--) {
			System.out.println("T="+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
		}
	}
	
}
