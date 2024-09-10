import pytest
from src.number_of_1_bits import hammingWeight


@pytest.mark.parametrize("input,expected", [
    (11, 3),
    (128, 1),
    (2147483645, 30)
])
def testHammingWeight(input: int, expected: int):
    assert hammingWeight(input) == expected
