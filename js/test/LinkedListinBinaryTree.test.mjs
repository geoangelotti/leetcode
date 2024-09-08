import test from "node:test";
import { strict as assert } from "node:assert";
import ListNode from "../src/ListNode.mjs";
import TreeNode from "../src/TreeNode.mjs";
import isSubPath from "../src/LinkedListinBinaryTree.mjs";

test("Linked List in Binary Tree", async (t) => {
  const tree = new TreeNode(
    1,
    new TreeNode(4, undefined, new TreeNode(2, new TreeNode(1))),
    new TreeNode(
      4,
      new TreeNode(
        2,
        new TreeNode(6),
        new TreeNode(8, new TreeNode(1), new TreeNode(3))
      )
    )
  );
  console.log(tree);
  await t.test("SubPath 3", () => {
    const list = new ListNode(4, new ListNode(2, new ListNode(8)));
    assert.strictEqual(isSubPath(list, tree), true);
  });
  await t.test("SubPath 4", () => {
    const list = new ListNode(
      1,
      new ListNode(4, new ListNode(2, new ListNode(6)))
    );
    assert.strictEqual(isSubPath(list, tree), true);
  });
  await t.test("not SubPath", () => {
    const list = new ListNode(
      1,
      new ListNode(4, new ListNode(2, new ListNode(6, new ListNode(8))))
    );
    assert.strictEqual(isSubPath(list, tree), true);
  });
});
