import java.util.concurrent.ForkJoinPool;

public class Volatile extends Thread {

	public volatile boolean running=true;
	
	public void run() {
		while(running) {
		System.out.println("running");
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		}
	}public void shutdown() {
		System.out.println("after shutdown");
		this.running=false;
	}
	public static void main(String[] args)throws InterruptedException  {
		
		Volatile v=new Volatile();
		v.start();
		Thread.sleep(500);
		v.shutdown();
		
	}
}
