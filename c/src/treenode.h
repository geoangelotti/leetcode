#ifndef TREENODE_H
#define TREENODE_H

#include <stddef.h>

struct TreeNode
{
	int val;
	struct TreeNode *left;
	struct TreeNode *right;
};

struct TreeNode *create_treenode(int val);
int treenodes_equal(struct TreeNode *t1, struct TreeNode *t2);

#endif // TREENODE_H