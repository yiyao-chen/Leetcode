"""
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Follow up: Do not use any built-in library function such as sqrt.

Example:
Input: num = 16
Output: true
"""

"""
perfect squares are sums of:
1+3+5+7+9+11+...

"""
class Solution(object):
    def isPerfectSquare(self, num):
        """
        :type num: int
        :rtype: bool
        """
        ssum = 0
        i = 1

        while ssum<num:
            ssum += i
            i+=2
        return ssum == num
