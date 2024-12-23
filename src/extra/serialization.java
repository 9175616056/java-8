package extra;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class serialization {

	public static void main(String[] args) {
		
		try {
			student s=new student("rohan");
			
			FileOutputStream f=new FileOutputStream("r.txt");
			
			ObjectOutputStream o= new ObjectOutputStream(f);
			
			o.writeObject(s);
			o.close();
			f.close();
			System.out.println("ro");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
