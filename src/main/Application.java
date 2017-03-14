package main;

import main.heap.KFrequentElement;

public class Application {

    public static void main(String[] args) {

        int[] input = {1, 1, 1, 1, 2, 2, 9};
//        int[] input = new int[9];
//        input[0] = 1;
//        input[1] = 5;
//        input[2] = 8;
//        input[3] = 9;
//        int[] second = {2,3,6,7,10};
//        MergeSortedArray.merge(input, 4, second, 5);
        for (int n : KFrequentElement.frequentElement(input, 2))
            System.out.print(n + " ");
    }

    public static LinkedList mergeList(LinkedList l1, LinkedList l2) {
        LinkedList merged = null;
        LinkedList head = null;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                if (head == null) {
                    merged = new LinkedList(l1.val);
                    head = merged;
                } else {
                    merged.next = new LinkedList(l1.val);
                    merged = merged.next;
                }
                l1 = l1.next;
            } else {
                if (head == null) {
                    merged = new LinkedList(l2.val);
                    head = merged;
                } else {
                    merged.next = new LinkedList(l2.val);
                    merged = merged.next;
                }
                l2 = l2.next;
            }
        }

        if (l1 == null && l2 != null) {
            merged.next = l2;
        }
        if (l1 != null && l2 == null) {
            merged.next = l1;
        }

        return head;
    }
}
