#include <stddef.h>
#include <stdlib.h>
#include "treenode.h"

struct TreeNode *sortedArrayToBSTIndex(int *nums, int numsSize, int left, int right)
{
	if (left > right)
		return NULL;
	int half = (left + right) / 2;
	struct TreeNode *newNode = (struct TreeNode *)malloc(sizeof(struct TreeNode));
	newNode->val = half[nums];
	newNode->left = sortedArrayToBSTIndex(nums, numsSize, left, half - 1);
	newNode->right = sortedArrayToBSTIndex(nums, numsSize, half + 1, right);
	return newNode;
}

struct TreeNode *sortedArrayToBST(int *nums, int numsSize)
{
	return sortedArrayToBSTIndex(nums, numsSize, 0, numsSize - 1);
}