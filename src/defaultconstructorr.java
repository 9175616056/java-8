
public class defaultconstructorr {

	public static void main(String[] args) {
		
		defaultconstructor f=new defaultconstructor();
		f.test();
	}
}
int x;
String name;
boolean c;

defaultconstructor(){
	x=11;
	name="rohan";
	c=false;
}
void test() {
	System.out.println(x+" " +name+" "+c+"");
}
public static void main(String[] args) {
	
	defaultconstructor f=new defaultconstructor();
	f.test();
}