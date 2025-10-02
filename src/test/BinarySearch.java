package test;

public class BinarySearch {
	

	  public static int binarySearch(int[] nums, int target) {
	        int l = 0;
	        int r = nums.length - 1;

	        while (l <= r) {
	            int mid = l + (r - l) / 2;

	            if (target == nums[mid]) {
	                return mid;
	            } else if (target < nums[mid]) {
	                r = mid - 1;
	            } else {
	                l = mid + 1;
	            }
	        }

	        return -1;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,3,5,7,9,11,13};
		
		int target = 7;
		
		int result = binarySearch(arr,target);
		
		

		if (result != -1) {
		     System.out.println("Element found at index: " + result);
		} else {
		      System.out.println("Element not found.");
		}


	}

}
