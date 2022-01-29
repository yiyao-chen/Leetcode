/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        
        
        
        while (low < high+1) {
            int mid = (low+high) / 2;
            System.out.println("mid: " + mid);

            if(target == nums[mid]) {
                return mid;
            }
            
            else if(target < nums[mid]) {
                high = mid-1;
            }
            else if (target > nums[mid]) {
                low = mid+1;
            }
        }
        
        return low;
    }
}
