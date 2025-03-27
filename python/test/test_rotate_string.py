import pytest
from src.rotate_string import rotateString


@pytest.mark.parametrize("s,goal,expected", [
    ("abcde", "cdeab", True),
    ("abcde", "abced", False)
])
def testMaximumWealth(s: str, goal: str, expected: bool):
    assert rotateString(s, goal) == expected
