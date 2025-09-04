def findClosest(x: int, y: int, z: int) -> int:
    match (abs(x - z), abs(y - z)):
        case (a, b) if a == b:
            return 0
        case (a, b) if a > b:
            return 2
        case _:
            return 1
