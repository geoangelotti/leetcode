#include <stdio.h>
#include <stdlib.h>
#include <assert.h>
#include "../src/treenode.h"
#include "../src/convert_sorted_array_to_binary_search_tree.c"

void test_convert_sorted_array_to_binary_search_tree1()
{
	int nums[] = {-10, -3, 0, 5, 9};
	int *nums_p = nums;
	int numsSize = 5;
	struct TreeNode *result = sortedArrayToBST(nums_p, numsSize);
	struct TreeNode *expected = create_treenode(0);
	expected->left = create_treenode(-10);
	expected->right = create_treenode(5);
	expected->left->right = create_treenode(-3);
	expected->right->right = create_treenode(9);
	assert(treenodes_equal(result, expected) == 1);
	free(result);
	free(expected);
	printf("Test case passed!\n");
}

void test_convert_sorted_array_to_binary_search_tree2()
{
	int nums[] = {1, 3};
	int *nums_p = nums;
	int numsSize = 2;
	struct TreeNode *result = sortedArrayToBST(nums_p, numsSize);
	struct TreeNode *expected = create_treenode(1);
	expected->right = create_treenode(3);
	assert(treenodes_equal(result, expected) == 1);
	free(result);
	free(expected);
	printf("Test case passed!\n");
}

int main()
{
	test_convert_sorted_array_to_binary_search_tree1();
	test_convert_sorted_array_to_binary_search_tree2();
	return 0;
}