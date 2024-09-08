#include <stddef.h>
#include "treenode.h"

struct TreeNode *invertTree(struct TreeNode *root)
{
	if (root == NULL)
	{
		return NULL;
	}
	struct TreeNode *left = root->left;
	struct TreeNode *right = root->right;
	root->left = right;
	root->right = left;
	invertTree(root->left);
	invertTree(root->right);
	return root;
}