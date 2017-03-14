package main;

import main.datastructure.TreeNode;

import java.util.*;
import java.util.LinkedList;

public class LargestValueInEachRow {

    public static void largestValue(TreeNode node){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        largestValue(queue, 0);
    }

    private static void largestValue(Queue<TreeNode> queue, int depth){
        if(queue.size() == 0) return;
        Queue<TreeNode> newQueue = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            max = Math.max(max, node.val);
            if(node.left != null)
                newQueue.add(node.left);
            if(node.right != null)
                newQueue.add(node.right);
        }

        System.out.println(depth + " : " + max);
        largestValue(newQueue, depth + 1);
    }
}
