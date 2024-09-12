use crate::list_node::ListNode;

pub fn swap_pairs(head: Option<Box<ListNode>>) -> Option<Box<ListNode>> {
    todo!()
}

#[cfg(test)]
mod tests {
    use super::*;
    use rstest::rstest;

    #[rstest]
    #[case(case1_input(), case1_expected())]
    #[case(None, None)]
    #[case(case3_input(), case3_expected())]
    #[case(case4_input(), case4_expected())]
    fn test_swap_pairs(
        #[case] head: Option<Box<ListNode>>,
        #[case] expected: Option<Box<ListNode>>,
    ) {
        let result = swap_pairs(head);
        assert_eq!(result, expected);
    }

    fn case1_input() -> Option<Box<ListNode>> {
        Some(Box::new(ListNode {
            val: 1,
            next: Some(Box::new(ListNode {
                val: 2,
                next: Some(Box::new(ListNode {
                    val: 3,
                    next: Some(Box::new(ListNode { val: 4, next: None })),
                })),
            })),
        }))
    }

    fn case1_expected() -> Option<Box<ListNode>> {
        Some(Box::new(ListNode {
            val: 2,
            next: Some(Box::new(ListNode {
                val: 1,
                next: Some(Box::new(ListNode {
                    val: 4,
                    next: Some(Box::new(ListNode { val: 3, next: None })),
                })),
            })),
        }))
    }

    fn case3_input() -> Option<Box<ListNode>> {
        Some(Box::new(ListNode { val: 1, next: None }))
    }

    fn case3_expected() -> Option<Box<ListNode>> {
        Some(Box::new(ListNode { val: 1, next: None }))
    }

    fn case4_input() -> Option<Box<ListNode>> {
        Some(Box::new(ListNode {
            val: 1,
            next: Some(Box::new(ListNode {
                val: 2,
                next: Some(Box::new(ListNode { val: 3, next: None })),
            })),
        }))
    }

    fn case4_expected() -> Option<Box<ListNode>> {
        Some(Box::new(ListNode {
            val: 2,
            next: Some(Box::new(ListNode {
                val: 1,
                next: Some(Box::new(ListNode { val: 3, next: None })),
            })),
        }))
    }
}
