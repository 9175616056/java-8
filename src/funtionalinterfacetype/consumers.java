package funtionalinterfacetype;

import java.util.function.Consumer;

public class consumers {

	public static void main(String[] args) {
		
		Consumer<String>c=s->System.out.println(s);
		c.accept("rohan");
		c.accept("awale");
		
	}
}
