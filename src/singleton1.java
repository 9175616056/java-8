import logicalquestions.p.Main;

public class singleton1 {
	//Private static variable to hold the single instance of the class
	private static singleton1 s1;
	
	//because nobody can call constructor for create object
	private singleton1() {
		
	}
	//Public static method to get the instance of the class
	public static singleton1 getInstance() {
//		if(s1 ==null) {
//			synchronized(singleton1.class) {
				if(s1==null) {
			s1=new singleton1();
			}//}
		//}
		return s1;
		
      

}
}
//multiple thread is calling object create many time 