package main.tree;

import main.datastructure.TreeNode;

import java.util.*;

public class FirstElementAtBottom {
    public static void firstElement(TreeNode node){
        Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.add(node);
        firstElement(queue);
    }

    private static void firstElement(Queue<TreeNode> queue){
        if(queue.size() == 0) return;
        Integer firstElement = null;
        int counter = 0;
        Queue<TreeNode> newQueue = new java.util.LinkedList<>();
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left != null)
                newQueue.add(node.left);
            if(node.right != null)
                newQueue.add(node.right);
            if(counter == 0){
                firstElement = node.val;
            }
            counter++;
        }

        if(newQueue.isEmpty())
            System.out.println(firstElement);

        firstElement(newQueue);
    }
}
