from typing import List


def findDuplicate(nums: List[int]) -> int:
    seen = set()
    for i in nums:
        if i in seen:
            return i
        seen.add(i)
