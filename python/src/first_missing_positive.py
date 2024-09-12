from typing import List


def firstMissingPositive(nums: List[int]) -> int:
    s = {x for x in nums}
    small = 1
    while small in s:
        small += 1
    return small
