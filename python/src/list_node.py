from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

    def __eq__(self, value) -> bool:
        if self is None and value is None:
            return True
        if self is None or value is None:
            return False
        if self is value:
            return True
        if self.val != value.val:
            return False
        return self.next == value.next

    def __str__(self) -> str:
        if self is None:
            return "None"
        return f"<{self.val}, {self.next}>"
