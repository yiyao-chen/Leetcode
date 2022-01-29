/*
Problem:

Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
*/


/*
Idea:
1. convert int to array
2. push elements from array to stack
3. pop from stack to get reversed array
4. compare two arrays
*/

class Solution {
    public boolean isPalindrome(int x) {
        Stack<Integer> stk = new Stack<>();  
        
        // convert int to array
        String temp = Integer.toString(x);

        int[] numbers = new int[temp.length()];
        
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
        }
        
        
        // push to stack
        for(int i : numbers) {
            stk.push(i);
        }
        

        // pop from stack to get reversed array
        int[] reversed = new int[temp.length()];

        int i = 0;
        while(!stk.empty()) {
            int el = stk.pop();
            reversed[i] = el;
            i++;
        }

        return Arrays.equals(numbers,reversed);
    }
}
