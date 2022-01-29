/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].


*/

class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] res = new int[n*2];

        for(int i=0; i<n*2; i++) {
            // even
            if(i % 2 == 0) {
                res[i] = nums[i/2];
            }
            // odd
            if(i % 2 == 1) {
                res[i] = nums[n + i /2];
                System.out.println("n: " + n);
                System.out.println("i: " + i);
                System.out.println("i/2: " + i/2);
                System.out.println("n+i/2: " + (n + i/2));




            }
        }

        return res;


    }
}
