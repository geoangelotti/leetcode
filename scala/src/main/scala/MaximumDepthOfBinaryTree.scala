def maxDepth(root: TreeNode): Int = {
  Option(root) match {
    case None => 0
    case Some(n) => 1 + scala.math.max(maxDepth(n.left), maxDepth(n.right))
  }
}
