"""
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

"""


"""
Idea:
sort both lists

two pointers i and j for nums1 and nums2

start from index 0 for both pointers

compare elements i and j point to
    if elements are same, keep the element
    if pointer i points to larger element
        increment j
    if pointer j points to larger element
        increment i

continue until i or j reaches the end of its array


"""
class Solution(object):


    def intersect(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        res = []

        # sort arrays in order to compare elements
        nums1.sort()
        nums2.sort()

        i, j = 0, 0 # pointers

        while i<len(nums1) and j<len(nums2):

            if nums1[i] < nums2[j]:
                i += 1
            elif nums1[i] > nums2[j]:
                j += 1
            else:
                res.append(nums1[i])
                i+=1
                j+=1

        return res
