import pytest
from typing import Optional
from src.list_node import ListNode
from src.add_two_numbers import addTwoNumbers


@pytest.mark.parametrize("l1,l2,expected", [
    (ListNode(2, ListNode(4, ListNode(3))), ListNode(5, ListNode(
        6, ListNode(4))), ListNode(7, ListNode(0, ListNode(8)))),
    (ListNode(0), ListNode(0), ListNode(0)),
    (ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9))))))), ListNode(9, ListNode(9, ListNode(
        9, ListNode(9)))), ListNode(8, ListNode(9, ListNode(9, ListNode(9, ListNode(0, ListNode(0, ListNode(0, ListNode(1)))))))))
])
def testAddTwoNumbers(l1: Optional[ListNode], l2: Optional[ListNode], expected: Optional[ListNode]):
    assert addTwoNumbers(l1, l2) == expected
