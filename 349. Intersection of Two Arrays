/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
*/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        // we perform binarysearch on the shorter array
        // find shorter array and sort it
        int m = nums1.length;
        int n = nums2.length;
        int[] shortArray;
        int[] longArray;

        if (m>n) {
            shortArray = nums2;
            longArray = nums1;
            Arrays.sort(shortArray);
        }else {
            shortArray = nums1;
            longArray = nums2;
            Arrays.sort(shortArray);
        }

        for (int x : shortArray) {
            System.out.println("x: " + x);
        }

        for (int y : longArray) {
            System.out.println("y: " + y);
        }

        // set keeps uniq values
        Set<Integer> set = new HashSet<>();

        // go through the long-array and check if element exists in short-array
        // using binary search
        // if so, add element to set

        for(int i=0; i<longArray.length; i++) {
            int index = bs(shortArray, longArray[i]);
            //System.out.println(index);
            if(index != -1) {
                System.out.println("true, i: " + index);
                set.add(shortArray[index]);
                System.out.println("longArray[index]: " + longArray[index]);
            }
        }

        // add elements from set to result-array

        int[] result = new int[set.size()];
        int i = 0;
        for (Integer num:set) {
            result[i++] = num;
        }

        return result;
    }

    public int bs(int[] a, int key) {
        int low = 0;
        int high = a.length-1;
        while(low <= high) {
            int mid = (low+high) /2;

            if(key < a[mid]) high = mid-1;
            else if(key > a[mid]) low = mid+1;
            else return mid;

        }
        return -1;
    }

}
