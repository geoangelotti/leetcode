import pytest
from src.find_closest_person import findClosest


@pytest.mark.parametrize("x,y,z,expected", [
    (2, 7, 4, 1),
    (2, 5, 6, 2),
    (1, 5, 3, 0),
])
def testFindDuplicate(x: int, y: int, z: int, expected: int):
    assert findClosest(x, y, z) == expected
