package main.list;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val){
        this.val = val;
    }

    public ListNode(int val, ListNode listNode){
        this.val = val;
        listNode.next = this;
    }

    public static void print(ListNode list){
        while (list != null){
            System.out.print(list.val);

            if(list.next != null) System.out.print(" -> ");

            list = list.next;
        }
    }

    public static ListNode getList(int[] vals){
        ListNode head = new ListNode(vals[0]);
        ListNode next = head;
        for(int i = 1; i < vals.length; i++){
            ListNode list = new ListNode(vals[i], next);
            next = list;
        }

        return head;
    }

    public static ListNode mergeList(ListNode l1, ListNode l2) {
        ListNode merged = null;
        ListNode head = null;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                if (head == null) {
                    merged = new ListNode(l1.val);
                    head = merged;
                } else {
                    merged.next = new ListNode(l1.val);
                    merged = merged.next;
                }
                l1 = l1.next;
            } else {
                if (head == null) {
                    merged = new ListNode(l2.val);
                    head = merged;
                } else {
                    merged.next = new ListNode(l2.val);
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
