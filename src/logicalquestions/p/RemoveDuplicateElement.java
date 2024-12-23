package logicalquestions.p;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		int []x = {1,1,2,3,4,4,5};//  call this array as X   //size 7
		int []temp = new int [x.length]; //we will create one more array exact same size
		                                  // above array means 7// directly right 7 or x.length
		                                  //if size of x changes automaticallly temp size changes
		int j=0;    // starting index of temp
		for(int i=0;i<x.length-1;i++) {  //create for loop 0 to 5 run
			if(x[i]!=x[i+1]) {     // comparing array value 1to1, 1to2, 2to3
				                   //if the value is equal it will false loop will repeat
				                   //if the true 
				temp[j]= x[i];   // copying value x to j  // i means 2 last vlaue opy as it is 
				j++;          // then increment the value of j
			}}
		temp[j]= x[x.length-1];  // coping the last value  x.length -1 
		System.out.println(j);   //how many times coping the value in j loop willl run those time below loop
		                         // j is giving me index no. thats why j+1
//		for(int arr: temp) {      //for printing  000 array takes a default value
//			System.out.println(arr);
//		}
	for (int m =0; m<j+1; m++) {     //loop is running j+1 times
		System.out.println(temp[m]);// how many times temp will run we discard the zero
	}
	
}
}