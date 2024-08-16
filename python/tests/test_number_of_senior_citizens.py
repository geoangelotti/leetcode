import pytest
from src.number_of_senior_citizens import countSeniors


@pytest.mark.parametrize("input,expected", [
    (["7868190130M7522", "5303914400F9211", "9273338290F4010"], 2),
    (["1313579440F2036", "2921522980M5644"], 0)
])
def testCountSenios(input, expected):
    assert countSeniors(input) == expected
