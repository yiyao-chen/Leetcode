/*
Let's call an array arr a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... arr[i-1] < arr[i]
arr[i] > arr[i+1] > ... > arr[arr.length - 1]
Given an integer array arr that is guaranteed to be a mountain, return any i such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

*/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 1;
        int high = arr.length-1;


        while(low<high) {
            int mid = (low+high)/2;
            System.out.println("mid: " + mid);


            if(arr[mid-1] < arr[mid] && arr[mid+1] < arr[mid]) {
                System.out.println("true: ");
                return mid;
            }
            if(arr[mid-1] > arr[mid]) {
                System.out.println("inleft: " + mid);

                high = mid;
            }
            if(arr[mid+1] > arr[mid]) {
                System.out.println("in right: " + mid);

                low = mid;
            }
        }
        return -1;

    }
}
