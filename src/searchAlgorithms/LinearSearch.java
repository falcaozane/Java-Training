package searchAlgorithms;

public class LinearSearch {

	public static int linearSearch(int[] nums, int target) {
        
        int n = nums.length;
        
        for(int i=0;i<n;i++) {
        		if(nums[i]==target) {
        			return i;
        		}
        }
        

        return -1;
    }


public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	int[] arr = {1,3,5,7,9,11,13};
	
	int target = 7;
	
	int result = linearSearch(arr,target);
	
	

	if (result != -1) {
	     System.out.println("Element found at index: " + result);
	} else {
	      System.out.println("Element not found.");
	}


}

}
