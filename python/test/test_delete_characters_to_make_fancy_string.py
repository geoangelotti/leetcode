import pytest
from src.delete_characters_to_make_fancy_string import makeFancyString


@pytest.mark.parametrize("input,expected", [
    ("leeetcode", "leetcode"),
    ("aaabaaaa", "aabaa"),
    ("aab", "aab"),
])
def testFindDuplicate(input: str, expected: str):
    assert makeFancyString(input) == expected
