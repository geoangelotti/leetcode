from typing import List
from itertools import groupby


def majorityElement(nums: List[int]) -> List[int]:
    return [k for k, v in {k: sum(1 for _ in g) for k, g in groupby(sorted(nums))}.items() if v > len(nums)/3]
