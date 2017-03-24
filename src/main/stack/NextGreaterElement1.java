package main.stack;

import java.util.HashMap;
import java.util.Stack;

/***
 * You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of
 * nums2.
 * Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
 * The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2.
 * If it does not exist, output -1 for this number.
 */

public class NextGreaterElement1 {
    public static int[] getNextGreater(int[] arr, int[] sa) {
        HashMap<Integer, Integer> pairs = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int subIndex = 1;
        stack.push(sa[0]);
        for (int i = 1; i < arr.length; i++) {
            while (stack.size() > 0 && arr[i] > stack.peek()) {
                    pairs.put(stack.pop(), arr[i]);
            }
            if (subIndex < sa.length && arr[i] == sa[subIndex]) {
                stack.add(sa[subIndex]);
                subIndex++;
            }
        }
        int[] res = new int[sa.length];
        for (int i = 0; i < sa.length; i++) {
            res[i] = pairs.get(sa[i]);
        }

        return res;
    }
}
