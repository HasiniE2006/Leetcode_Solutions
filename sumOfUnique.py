class Solution(object):
    def sumOfUnique(self, nums):
        count = {}
        for num in nums:
            count[num] = count.get(num, 0) + 1
        ans = 0
        for num in count:
            if count[num] == 1:
                ans += num
        return ans
