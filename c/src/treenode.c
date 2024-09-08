#include <stddef.h>
#include <stdlib.h>
#include "treenode.h"

struct TreeNode *create_treenode(int val)
{
	struct TreeNode *node = (struct TreeNode *)malloc(sizeof(struct TreeNode));
	node->val = val;
	node->left = NULL;
	node->right = NULL;
	return node;
}

int treenodes_equal(struct TreeNode *t1, struct TreeNode *t2)
{
	if (t1 == NULL && t2 == NULL)
	{
		return 1;
	}
	if (t1 == NULL || t2 == NULL)
	{
		return 0;
	}
	if (t1->val != t2->val)
	{
		return 0;
	}
	return treenodes_equal(t1->left, t2->left) && treenodes_equal(t1->right, t2->right);
}