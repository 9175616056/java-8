package Java8features;

public class findduplicatecharacterfromstring {

	public static void main(String[] args) {
		String str=new String("nnaarohnnaawle");
		int count=0;//for initializing the integer
		
		char[]ch=str.toCharArray();//for converting string array to characcter array
		for (int i = 0; i < ch.length; i++) {//it help us to iterate the current string
			                                   //character array iterate   
			for (int j = i+1; j < ch.length; j++) {//This is another for-loop nested inside
				//the first loop. It iterates over the character array starting from the 
				//position i + 1 to the end of the array. This loop compares each character 
				//with the subsequent characters in the array to find duplicates.
				if(ch[i]==ch[j]) {//it check the character of i =to j
					System.out.println(ch[j]);
					count++;
				}
			}
		}
			System.out.println(count);
		
	}
	
	}

