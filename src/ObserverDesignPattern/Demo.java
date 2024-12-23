package ObserverDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		YoutubeChannel channel= new YoutubeChannel();
		
		Subscriber rohan= new Subscriber("Rohan");
		Subscriber satyam= new Subscriber("Satyam");
		
		channel.subscribe(rohan);
		channel.subscribe(satyam);
		
		//channel.unsubscribe(Observer);
		
		channel.newVideoUploaded("learn design pattern");
		channel.newVideoUploaded("new Angular course");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("Press 1 to upload video");
			System.out.println("Press 2 to create new subscriber");
			System.out.println("Press 3 to exit");
			System.out.println("Press 4 to unsubscribe");
			
			int c=Integer.parseInt(br.readLine());
			
			if(c==1) {
				//new video upload code
				System.out.println("Enter video title");
				String videoTitle=br.readLine();
				channel.newVideoUploaded(videoTitle);
			}
			else if(c==2) {
			// create new subscriber code 
				System.out.println("Enter name of subscriber");
				String subsName=br.readLine();
				
				Subscriber subscribe3=new Subscriber(subsName);
				channel.subscribe(subscribe3);
			}else if(c==3) {
			//exit	
				System.out.println("Thankyou for using app");
				break;
			
			}else {
				//exit wrong input
				System.out.println("wrong input");
			}
				
			
		}
	}
}
