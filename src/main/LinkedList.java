package main;

public class LinkedList {
    int val;
    LinkedList next;

    LinkedList(int val){
        this.val = val;
    }

    LinkedList(int val, LinkedList linkedList){
        this.val = val;
        linkedList.next = this;
    }

    public static void print(LinkedList list){
        while (list != null){
            System.out.print(list.val);

            if(list.next != null) System.out.print(" -> ");

            list = list.next;
        }
    }

    public static LinkedList getList(int[] vals){
        LinkedList head = new LinkedList(vals[0]);
        LinkedList next = head;
        for(int i = 1; i < vals.length; i++){
            LinkedList list = new LinkedList(vals[i], next);
            next = list;
        }

        return head;
    }
}
