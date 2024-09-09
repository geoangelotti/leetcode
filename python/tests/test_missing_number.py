import pytest
from typing import List
from src.missing_number import missingNumber


@pytest.mark.parametrize("input,expected", [
    ([3, 0, 1], 2),
    ([0, 1], 1),
    ([9, 6, 4, 2, 3, 5, 7, 0, 1], 8)
])
def testMissingNumber(input: List[str], expected: int):
    assert missingNumber(input) == expected
