from typing import List


def missingNumber(nums: List[int]) -> int:
    s = set(nums)
    for i in range(len(nums)+1):
        if not (i in s):
            return i
