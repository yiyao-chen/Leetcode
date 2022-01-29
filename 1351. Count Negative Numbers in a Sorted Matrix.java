/*
Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.
*/

class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;

        int rows = grid.length; // number of rows
        int cols = grid[0].length;

        int i = 0; // index
        int j = cols-1; // index, go from right to left

        while(i<rows && j>=0) {
            if(grid[i][j]<0) {
                count += rows - i; // add number of cells below this
                j--; // move to the left
            }else { // no negative values
                i++; // move to next row
            }
        }
        return count;
    }
}
