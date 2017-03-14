package main;

public class ReverseLinkedList {


    public static LinkedList reverse(LinkedList head){
        if(head == null) return null;
        if(head.next == null) return head;
        LinkedList newHead = null;
        LinkedList cur = head;
        LinkedList next = cur.next;
        while(next != null){
            LinkedList tmp = next.next;
            next.next = cur;
            newHead = next;
            cur = next;
            next = tmp;
        }

        head.next = null;
        return newHead;
    }
}
