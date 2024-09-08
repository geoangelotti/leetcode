#include <stdio.h>
#include <stdlib.h>
#include <assert.h>
#include "../src/treenode.h"
#include "../src/invert_binary_tree.c"

void test_invert_binary_tree1()
{
	struct TreeNode *root = create_treenode(4);
	root->left = create_treenode(2);
	root->right = create_treenode(7);
	root->left->left = create_treenode(1);
	root->left->right = create_treenode(3);
	root->right->left = create_treenode(6);
	root->right->right = create_treenode(9);
	struct TreeNode *result = invertTree(root);
	struct TreeNode *expected = create_treenode(4);
	expected->left = create_treenode(7);
	expected->right = create_treenode(2);
	expected->left->left = create_treenode(9);
	expected->left->right = create_treenode(6);
	expected->right->left = create_treenode(3);
	expected->right->right = create_treenode(1);
	assert(treenodes_equal(result, expected) == 1);
	free(result);
	free(expected);
	printf("Test case passed!\n");
}

void test_invert_binary_tree2()
{
	struct TreeNode *root = create_treenode(2);
	root->left = create_treenode(1);
	root->right = create_treenode(3);
	struct TreeNode *result = invertTree(root);
	struct TreeNode *expected = create_treenode(2);
	expected->left = create_treenode(3);
	expected->right = create_treenode(1);
	assert(treenodes_equal(result, expected) == 1);
	free(result);
	free(expected);
	printf("Test case passed!\n");
}

int main()
{
	test_invert_binary_tree1();
	test_invert_binary_tree2();
	return 0;
}