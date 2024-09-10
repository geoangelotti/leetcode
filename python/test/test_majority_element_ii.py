import pytest
from typing import List
from src.majority_element_ii import majorityElement


@pytest.mark.parametrize("input,expected", [
    ([3, 2, 3], [3]),
    ([1], [1]),
    ([1, 2], [1, 2])
])
def testMajorityElement(input: List[str], expected: List[int]):
    assert majorityElement(input) == expected
