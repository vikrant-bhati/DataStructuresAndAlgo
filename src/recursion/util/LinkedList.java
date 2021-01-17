package recursion.util;

public class LinkedList {
    public ListNode head;


    public void add(int val){
        ListNode node = new ListNode(val);
        if(head==null){
            head=node;
        }else{
            ListNode temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next=node;
        }
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("[");
        ListNode temp = head;
        while(temp!=null){
            str.append(" ").append(temp.val);
            temp=temp.next;
        }
        str.append(" ]");
        return str.toString();
    }
}
