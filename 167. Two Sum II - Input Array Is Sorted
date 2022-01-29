"""
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.


Idea:
- start with left index as the 1st index and right index as the last index of the array.

- Calculate the sum of the two elements at the two indices.

    If it is greater than the target, decrese the sum/decrement the         right index.
    If it is lesser than the target, increse the sum/ inrement the left     index.

Continue this process untill the sum is equal to the target.
"""
class Solution(object):

    def twoSum(self, numbers, target):
        """
        :type numbers: List[int]
        :type target: int
        :rtype: List[int]
        """

        res = []

        left, right = 0, len(numbers)-1

        while left < right:
            if numbers[left]+numbers[right] == target:
                res.append(left+1)
                res.append(right+1)
                return res
            if numbers[left]+numbers[right] > target:
                right = right-1
            if numbers[left]+numbers[right] < target:
                left = left+1
        return res
