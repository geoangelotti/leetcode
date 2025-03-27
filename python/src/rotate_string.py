def rotateString(s: str, goal: str) -> bool:
    if s == goal:
        return True
    temp = s[1:] + s[0]
    while temp != s:
        if temp == goal:
            return True
        temp = temp[1:] + temp[0]
    return False
