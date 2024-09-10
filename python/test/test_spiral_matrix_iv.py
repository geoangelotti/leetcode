import pytest
from typing import List, Optional
from src.list_node import ListNode
from src.spiral_matrix_iv import spiralMatrix


@pytest.mark.parametrize("m,n,head,expected", [
    (3, 5, ListNode(3, ListNode(0, ListNode(2, ListNode(6, ListNode(8, ListNode(1, ListNode(7, ListNode(9, ListNode(
        4, ListNode(2, ListNode(5, ListNode(5, ListNode(0))))))))))))), [[3, 0, 2, 6, 8], [5, 0, -1, -1, 1], [5, 2, 4, 9, 7]]),
    (1, 4, ListNode(0, ListNode(1, ListNode(2))), [[0, 1, 2, -1]])
])
def testSpiralMatrix(m: int, n: int, head: Optional[ListNode], expected: List[List[int]]):
    assert spiralMatrix(m, n, head) == expected
