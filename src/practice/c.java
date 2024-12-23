package practice;

import java.util.Arrays;

public class c {

	

	    public static void rotate(int[] nums, int k) {
	        k = k % nums.length;  // To handle cases where k is larger than array length
	        // Step 1: Reverse the entire array
	        reverse(nums, 0, nums.length - 1);
	        
	        // Step 2: Reverse the first k elements
	        reverse(nums, 0, k - 1);
	        
	        // Step 3: Reverse the remaining elements
	        reverse(nums, k, nums.length - 1);
	    }

	    // Helper method to reverse a portion of the array
	    private static void reverse(int[] nums, int start, int end) {
	        while (start < end) {
	            int temp = nums[start];
	            nums[start] = nums[end];
	            nums[end] = temp;
	            start++;
	            end--;
	        }
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3, 4, 5, 6, 7};
	        int k = 3;
	        rotate(nums, k);
	        System.out.println(Arrays.toString(nums));  // Output: [5, 6, 7, 1, 2, 3, 4]
	    }
	}


