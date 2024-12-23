
public class breakkeyword {

	public static void main(String[] args) {
		
		for (int i = 0; i <5; i++) { //012
			System.out.println(i);
			System.out.println("java");
			if(i==2) {
				System.out.println("end");
				break;
			}
		}
//		x:for (int i = 0; i < 5; i++) {
//			if(i==3) {  //this will run  012
//				break x;
//			}System.out.println(i);
//		}
	}
}
//if x is applied on if 01234 will run