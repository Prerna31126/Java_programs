
public class Solution {
	
	    public static int searchInsert(int[] nums, int target) {
	        int s = 0, e = nums.length-1;
	         int mid = s +(e-s)/2;
	        while(s<=e){
	             mid = s +(e-s)/2;
	            if(nums[mid]==target)
	                return mid;
	                else if(nums[mid]>target){
	                    e = mid-1;
	                }else{
	                    s=mid+1;
	                }
	        } 
	        return s;
	}
	    public static void main(String[] args) {
	    	int[] num= new int[]{3,5,7,9};
	    	int target1=7;
	    	int index = searchInsert(num, target1);
	    	System.out.println("Search element index "+ index);
	    }
	}



