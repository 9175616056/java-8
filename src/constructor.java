
public class constructor {

	constructor (){
		System.out.println(111);
	}
	constructor(int x){
		System.out.println(x);
	}
	public static void main(String[] args) {
		constructor c= new constructor();
		constructor c2=new constructor(2222);
		
	}
}
