import pytest
from src.shortest_palindrome import shortestPalindrome


@pytest.mark.parametrize("s,expected", [
    ("aacecaaa", "aaacecaaa"),
    ("abcd", "dcbabcd"),
])
def testMaximumWealth(s: str, expected: str):
    assert shortestPalindrome(s) == expected
