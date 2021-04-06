package com.focused.practice.org.tree.traversal;
import java.util.*;


public class ReverseLevelOrderTraversal {
    public static List<List<Integer>> traverse(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        // TODO: Write your code here
        if(root == null) return null;

        Queue<TreeNode> levelQueue = new LinkedList<>();
        levelQueue.offer(root);

        while(!levelQueue.isEmpty()){
            int levelSize = levelQueue.size();

            List<Integer> subArray = new ArrayList<>(levelSize);

            for(int i = 0; i < levelSize; i++){
                TreeNode currentNode = levelQueue.poll();
                subArray.add(currentNode.val);
                if(currentNode.left!=null) levelQueue.offer(currentNode.left);
                if(currentNode.right!=null) levelQueue.offer(currentNode.right);

            }
            result.add(0,subArray);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        List<List<Integer>> result = ReverseLevelOrderTraversal.traverse(root);
        System.out.println("Reverse level order traversal: " + result);
    }
}
