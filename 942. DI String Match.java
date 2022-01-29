/*
A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

s[i] == 'I' if perm[i] < perm[i + 1], and
s[i] == 'D' if perm[i] > perm[i + 1].
Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.
*/

class Solution {
    public int[] diStringMatch(String s) {
        int[] list = new int[s.length()+1];

        int left = 0;
        int right = s.length();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'I') {
                list[i] = left++;

                System.out.println("I : " + list[i]);
            }else {
                list[i] = right--;
                System.out.println("D: " + list[i]);


            }

        }

        list[s.length()] = left++;



        return list;
    }
}
