package com.focused.practice.org.tree.traversal.depth.first;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
};

public class TreePathSum {

    public static boolean hasPath(TreeNode root, int sum) {
        // use recursion to keep track of right nodes from root and
        // left nodes from root.
        if(root == null) return false;

        TreeNode currentNode = root;
        if(sum == currentNode.val && currentNode.left == null && currentNode.right ==null) {
                return true;
        }
        return hasPath(root.left, sum - root.val) || hasPath(root.right, sum - root.val);
    }



    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        System.out.println("Tree has path: " + TreePathSum.hasPath(root, 24));
        System.out.println("Tree has path: " + TreePathSum.hasPath(root, 18));
    }
}
