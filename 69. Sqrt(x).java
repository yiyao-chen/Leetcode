/*
Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
*/

class Solution {
    public int mySqrt(int x) {
        long low = 0;
        long high = x;
                
        if(x<2) {
            return x;
        }
        
        while (low < high+1) {
            long mid = (low+ high) / 2;
            System.out.println("mid: " + mid);

            if(mid*mid == x) {
                return (int)mid;
            }
            else if(mid*mid > x ) {
                System.out.println("mid*mid > x " );
                high = mid-1;
            }
            else if (mid*mid < x) {
                System.out.println("mid*mid < x " );
                low = mid+1;
            }
        }
        
        return (int)low-1;
    }
}
