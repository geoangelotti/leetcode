from typing import List


def maximumWealth(accounts: List[List[int]]) -> int:
    return max(sum(row) for row in accounts)
