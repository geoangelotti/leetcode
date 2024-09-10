import pytest
from typing import List
from src.find_the_duplicate_number import findDuplicate


@pytest.mark.parametrize("input,expected", [
    ([1, 3, 4, 2, 2], 2),
    ([3, 1, 3, 4, 2], 3),
    ([3, 3, 3, 3, 3], 3),
])
def testFindDuplicate(input: List[int], expected: int):
    assert findDuplicate(input) == expected
