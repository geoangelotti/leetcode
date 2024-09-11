import pytest
from typing import List
from src.palindrome_number import isPalindrome


@pytest.mark.parametrize("input,expected", [
    (121, True),
    (-121, False),
    (120, False),
])
def testIsPalindrome(input: int, expected: bool):
    assert isPalindrome(input) == expected
