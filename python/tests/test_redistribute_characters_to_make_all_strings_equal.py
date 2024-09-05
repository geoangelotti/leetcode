import pytest
from typing import List
from src.redistribute_characters_to_make_all_strings_equal import makeEqual


@pytest.mark.parametrize("input,expected", [
    (["abc", "aabc", "bc"], True),
    (["ab", "a"], False)
])
def testMakeEqual(input: List[str], expected: bool):
    assert makeEqual(input) == expected
