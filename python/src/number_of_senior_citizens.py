from typing import List


def countSeniors(details: List[str]) -> int:
    return len(list(filter(lambda a: a > 60, [int(senior[11:13]) for senior in details])))
