import pytest
from typing import List
from src.richest_customer_wealth import maximumWealth


@pytest.mark.parametrize("input,expected", [
    ([[1, 2, 3], [3, 2, 1]], 6),
    ([[1, 5], [7, 3], [3, 5]], 10),
    ([[2, 8, 7], [7, 1, 3], [1, 9, 5]], 17),
])
def testMaximumWealth(input: List[List[str]], expected: int):
    assert maximumWealth(input) == expected
