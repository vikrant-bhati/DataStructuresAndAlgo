package recursion.simple;

import recursion.util.LinkedList;
import recursion.util.ListNode;

public class ReverseLinkedList {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        LinkedList list = new LinkedList();
        for(int val : arr){
            list.add(val);
        }
        System.out.println("List before reversal");
        System.out.println(list.toString());
        System.out.println("List after reversal");
        reverseList(list);

    }

    public static void reverseList(LinkedList list){
        ListNode newHead = list.head;
        while(newHead.next!=null){
            newHead=newHead.next;
        }
        solution(list.head);
        System.out.println();
        while(newHead!=null){
            System.out.print(newHead.val+" ");
            newHead=newHead.next;
        }
        System.out.println();
    }

    public static ListNode solution (ListNode head){
        if(head == null || head.next==null){
            return head;
        }
        ListNode temp = solution(head.next);
        temp.next=head;
        head.next=null;
        return head;
    }
}
