package main.heap;

import main.util.comparator.EntryComparator;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KFrequentElement {
    /***
     * Given a non-empty array of integers, return the k most frequent elements.
     * <p>
     * For example,
     * Given [1,1,1,2,2,3] and k = 2, return [1,2].
     * <p>
     * Note:
     * You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
     * Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
     */
    public static int[] frequentElement(int[] arr, int k) {
        PriorityQueue<Map.Entry<Integer, Integer>> frequencyMap = new PriorityQueue<>(Collections.reverseOrder(new EntryComparator()));

        HashMap<Integer, Integer> pairs = new HashMap<>();
        for (int i : arr) {
            int frequent = pairs.getOrDefault(i, 0);
            frequent++;
            pairs.put(i, frequent);
        }
        for (Map.Entry<Integer, Integer> entry : pairs.entrySet()) {
            frequencyMap.add(entry);
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = frequencyMap.poll().getKey();
        }

        return result;
    }
}
