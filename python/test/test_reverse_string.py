import pytest
from typing import List
from src.reverse_string import reverseString


@pytest.mark.parametrize("input,expected", [
    (["h", "e", "l", "l", "o"], ["o", "l", "l", "e", "h"]),
    (["H", "a", "n", "n", "a", "h"], ["h", "a", "n", "n", "a", "H"])
])
def testReverseString(input: List[str], expected: List[str]):
    s = input
    reverseString(s)
    assert s == expected
