package main;

import main.datastructure.TreeNode;

import java.util.Arrays;

public class BST {

    public static TreeNode contructBST(int[] nums){
        if(nums == null || nums.length == 0) return null;
        if(nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        int mid = nums.length/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = contructBST(Arrays.copyOfRange(nums, 0, mid));
        root.right = contructBST(Arrays.copyOfRange(nums, mid+1, nums.length));
        return root;
    }
}
