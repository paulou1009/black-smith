package main.list;

public class ReverseLinkedList {


    public static ListNode reverse(ListNode head){
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode newHead = null;
        ListNode cur = head;
        ListNode next = cur.next;
        while(next != null){
            ListNode tmp = next.next;
            next.next = cur;
            newHead = next;
            cur = next;
            next = tmp;
        }

        head.next = null;
        return newHead;
    }
}
