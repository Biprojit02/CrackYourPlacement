class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        set1 = set(nums1)
        set2 = set(nums2)
        ans = [[], []]

        for i in set1:
            if i not in set2:
                ans[0].append(i)

        for j in set2:
            if j not in set1:
                ans[1].append(j)

        return ans