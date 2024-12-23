
public class threadd implements Runnable{

	@Override
	public synchronized void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try{Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
		
	}
	public static void main(String[] args) {
		threadd t=new threadd();
		Thread th=new Thread(t);
		
		Threads s=new Threads();
		s.start();
		th.start();
	}

}
