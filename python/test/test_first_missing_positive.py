import pytest
from typing import List
from src.first_missing_positive import firstMissingPositive


@pytest.mark.parametrize("nums,expected", [
    ([1, 2, 0], 3),
    ([3, 4, -1, 1], 2),
    ([7, 8, 9, 11, 12], 1)
])
def testFirstMissingPositive(nums: List[str], expected: int):
    assert firstMissingPositive(nums) == expected
