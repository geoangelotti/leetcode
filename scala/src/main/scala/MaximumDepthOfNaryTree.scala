def maxDepth(root: Node): Int = {
  def traverse(node: Node, depth: Int): Int =
    node.children match {
      case Nil => depth
      case c => c.map(traverse(_, depth+1)).max
    }

  Option(root).map(traverse(_, 1)).getOrElse(0)
}
