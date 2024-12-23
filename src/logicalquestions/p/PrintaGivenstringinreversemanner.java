package logicalquestions.p;

public class PrintaGivenstringinreversemanner {

	public static void main(String[] args) {
		
		String str= "Pankaj sir Academy";
		
		for (int i = str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i));//this take one by one character and print it
		}
	}
}

//we take varaible i it runs string length -1 because string start from 0
//i>=0 because starting point is zero,then we want loop is run reverse that why i--
//
