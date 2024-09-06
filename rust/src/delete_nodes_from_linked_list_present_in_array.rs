use crate::list_node::ListNode;

fn modified_list(nums: Vec<i32>, head: Option<Box<ListNode>>) -> Option<Box<ListNode>> {
    todo!()
}

#[cfg(test)]
mod tests {
    use super::*;
    use rstest::rstest;

    #[rstest]
    #[case(vec![1, 2, 3], case1_input(), case1_expected())]
    #[case(vec![1], case2_input(), case2_expected())]
    #[case(vec![5], case3_input(), case3_expected())]
    fn test_modified_list(
        #[case] nums: Vec<i32>,
        #[case] head: Option<Box<ListNode>>,
        #[case] expected: Option<Box<ListNode>>,
    ) {
        let result = modified_list(nums, head);
        assert_eq!(result, expected);
    }

    fn case1_input() -> Option<Box<ListNode>> {
        Some(Box::new(ListNode {
            val: 1,
            next: Some(Box::new(ListNode {
                val: 2,
                next: Some(Box::new(ListNode {
                    val: 3,
                    next: Some(Box::new(ListNode {
                        val: 4,
                        next: Some(Box::new(ListNode { val: 5, next: None })),
                    })),
                })),
            })),
        }))
    }

    fn case1_expected() -> Option<Box<ListNode>> {
        Some(Box::new(ListNode {
            val: 4,
            next: Some(Box::new(ListNode { val: 5, next: None })),
        }))
    }

    fn case2_input() -> Option<Box<ListNode>> {
        Some(Box::new(ListNode {
            val: 1,
            next: Some(Box::new(ListNode {
                val: 2,
                next: Some(Box::new(ListNode {
                    val: 1,
                    next: Some(Box::new(ListNode {
                        val: 2,
                        next: Some(Box::new(ListNode {
                            val: 1,
                            next: Some(Box::new(ListNode { val: 2, next: None })),
                        })),
                    })),
                })),
            })),
        }))
    }

    fn case2_expected() -> Option<Box<ListNode>> {
        Some(Box::new(ListNode {
            val: 2,
            next: Some(Box::new(ListNode {
                val: 2,
                next: Some(Box::new(ListNode { val: 2, next: None })),
            })),
        }))
    }

    fn case3_input() -> Option<Box<ListNode>> {
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

    fn case3_expected() -> Option<Box<ListNode>> {
        case3_input()
    }
}
