from collections import Counter
from typing import List


def makeEqual(words: List[str]) -> bool:
    return all([x % len(words) == 0 for x in Counter("".join(words)).values()])
