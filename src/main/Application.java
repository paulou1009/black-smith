package main;

import main.datastructure.TreeNode;
import main.list.ListNode;
import main.sort.QuickSort;

public class Application {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        head.next = head1;
        head1.next = head2;

        head = removeNthFromEnd(head,2);
        while(head != null){
            System.out.print(head.val);
            head = head.next;
        }
    }
    public static ListNode removeNthFromEnd(ListNode a, int b) {
        ListNode list = a;
        //reverse the list
        list = reverse(list);
        ListNode tmpHeader = list;
        //delete the nth node from the head
        while(b > 2 && list.next != null){
            list = list.next;
            b--;
        }
        if(list.next != null && list.next.next != null){
            list.next = list.next.next;
        } else {
            list.next = null;
        }
        //reverse the list back
        tmpHeader = reverse(tmpHeader);
        return tmpHeader;
    }

    public static ListNode reverse(ListNode node){
        if(node == null) return node;
        ListNode cur = node;
        ListNode next = cur.next;

        while(cur !=null && next != null){
            ListNode tmp = next.next;
            next.next = cur;
            cur = next;
            next = tmp;
        }
        //original head.next point to null
        node.next = null;
        return cur;
    }
}
