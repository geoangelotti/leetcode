from typing import Optional
from src.list_node import ListNode


def addTwoNumbers(l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
    parent = ListNode(42)
    current = parent
    n1 = l1
    n2 = l2
    carry = 0
    while (n1 != None or n2 != None):
        v1 = n1.val if n1 != None else 0
        v2 = n2.val if n2 != None else 0
        sum = v1 + v2 + carry
        carry = sum // 10
        current.next = ListNode(sum % 10)
        current = current.next
        n1 = n1.next if n1 else None
        n2 = n2.next if n2 else None
    if carry > 0:
        current.next = ListNode(carry)
    return parent.next
