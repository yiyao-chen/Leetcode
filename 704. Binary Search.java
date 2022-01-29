/*
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

*/
class Solution {
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length;

        while (low<high) {
            int i = low;
            int mid = (low+high)/2;
            while (i < high) {
                if(target < nums[i]){
                    high = mid-1;
                }else if(target > nums[i]) {
                    low = mid+1;
                }
                else {
                    return i;
                }
                i++;
            }

        }
        return -1;
    }
}
