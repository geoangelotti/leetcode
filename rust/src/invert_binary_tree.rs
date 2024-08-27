use std::cell::RefCell;
use std::rc::Rc;

use crate::tree_node::TreeNode;
fn invert_tree(root: Option<Rc<RefCell<TreeNode>>>) -> Option<Rc<RefCell<TreeNode>>> {
    todo!()
}

#[cfg(test)]
mod tests {
    use super::*;
    use rstest::rstest;

    #[rstest]
    #[case(case1_tree(), case1_inverted_tree())]
    #[case(case2_tree(), case2_inverted_tree())]
    #[case(None, None)]
    fn test_invert_tree(
        #[case] root: Option<Rc<RefCell<TreeNode>>>,
        #[case] expected: Option<Rc<RefCell<TreeNode>>>,
    ) {
        let result = invert_tree(root);
        assert_eq!(result, expected);
    }

    fn case1_tree() -> Option<Rc<RefCell<TreeNode>>> {
        let case2_tree = case2_tree();
        let t9 = Some(Rc::new(RefCell::new(TreeNode::new(1))));
        let t6 = Some(Rc::new(RefCell::new(TreeNode::new(6))));
        let mut t7 = TreeNode::new(7);
        t7.right = t9;
        t7.left = t6;
        let mut t4 = TreeNode::new(4);
        t4.left = case2_tree;
        t4.right = Some(Rc::new(RefCell::new(t7)));
        Some(Rc::new(RefCell::new(t4)))
    }
    fn case1_inverted_tree() -> Option<Rc<RefCell<TreeNode>>> {
        let case2_inverted_tree = case2_inverted_tree();
        let t9 = Some(Rc::new(RefCell::new(TreeNode::new(1))));
        let t6 = Some(Rc::new(RefCell::new(TreeNode::new(6))));
        let mut t7 = TreeNode::new(7);
        t7.left = t9;
        t7.right = t6;
        let mut t4 = TreeNode::new(4);
        t4.right = case2_inverted_tree;
        t4.left = Some(Rc::new(RefCell::new(t7)));
        Some(Rc::new(RefCell::new(t4)))
    }

    fn case2_tree() -> Option<Rc<RefCell<TreeNode>>> {
        let t1 = Some(Rc::new(RefCell::new(TreeNode::new(1))));
        let t3 = Some(Rc::new(RefCell::new(TreeNode::new(3))));
        let mut t2 = TreeNode::new(2);
        t2.left = t1;
        t2.right = t3;
        Some(Rc::new(RefCell::new(t2)))
    }

    fn case2_inverted_tree() -> Option<Rc<RefCell<TreeNode>>> {
        let t1 = Some(Rc::new(RefCell::new(TreeNode::new(1))));
        let t3 = Some(Rc::new(RefCell::new(TreeNode::new(3))));
        let mut t2 = TreeNode::new(2);
        t2.right = t1;
        t2.left = t3;
        Some(Rc::new(RefCell::new(t2)))
    }
}
