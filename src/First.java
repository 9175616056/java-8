import java.util.HashMap;

public class First {

    public static void main(String[] args) {
       
    	Integer test1 =  127;
    	Integer test2 = 127;
    	
    	String s1="rohan";
    	String s2="rohan";
    	
    	String s3=new String("rohan");
    	String s4=new String("rohan");
    	
    	int t1=11;
    	int t2=11;
    	
    	

    	System.out.println(test1 == test2);
    	System.out.println(s1==s2);
    	System.out.println(s3==s4);
    	System.out.println(t1==t2);
    }
}