
/*
Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it in the maximum amount of balanced strings.

Return the maximum amount of split balanced strings.
*/


class Solution {
    public int balancedStringSplit(String s) {
        Stack<Character> stack = new Stack<>();

        int ans = 0;

        for (char ch : s.toCharArray()) {

            if (stack.isEmpty() || stack.peek() == ch)
                stack.push(ch);

            //if chars are balanced - remove the pair
            else
                stack.pop();

            //if stack is empty - all pairs are balanced and we have a balanced substring
            if (stack.isEmpty())
                ans++;
        }

        return ans;



    }
}
