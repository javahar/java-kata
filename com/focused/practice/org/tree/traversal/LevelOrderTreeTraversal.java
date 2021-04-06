package com.focused.practice.org.tree.traversal;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
};

/*Problem statement :Given a binary tree, populate an array to represent its level-by-level traversal.
You should populate the values of all nodes of each level
from left to right in separate sub-arrays.

hint: use queues

The challenging part here is how to keep track of the nodes of the same level and sublevel
Queues to the rescue. Add the current node/nodes to the queue.

But when dequeing add the nodes of the child to the queue BIG IDEA.The child/childs will be
added to the end of the queue.

The enque and deque process will keep continuing untill there are no more child nodes left.
Which means the queue is empty.
*/
public class LevelOrderTreeTraversal {


    public static List<List<Integer>> traverse(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null){
            return null;
        }
        Queue<TreeNode> levelQueue = new LinkedList<>();
        levelQueue.offer(root);


        while(!levelQueue.isEmpty()){
            //getting the size of the queue upfront is important for this problem
            // as the queue size in the forloop keeps changing.
            int levelSize = levelQueue.size();

            List<Integer> subArray = new ArrayList<>(levelSize);

            for(int i =0 ; i < levelSize; i++){
                TreeNode currentNode = levelQueue.poll();
                subArray.add(currentNode.val);
                if(currentNode.left!=null) levelQueue.offer(currentNode.left);

                if(currentNode.right!=null) levelQueue.offer(currentNode.right);

            }
           result.add(subArray);
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
        List<List<Integer>> result = LevelOrderTreeTraversal.traverse(root);
        System.out.println("Level order traversal: " + result);
    }
}
