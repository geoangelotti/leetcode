from typing import List


def reverseString(s: List[str]) -> None:
    for i in range(len(s)//2):
        s[i], s[(i+1)*(-1)] = s[(i+1)*(-1)], s[i]
