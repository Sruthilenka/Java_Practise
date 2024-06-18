package LinkedListImplementation;

public class LinkedlistImp {
    public static void main(String[] args) {
        //creating nodes of linked list
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(8);
        ListNode l3 = new ListNode(15);

        //linking those nodes
        l1.next = l2;
        l2.next = l3;
        l3.next = null;

        //print Values
        ListNode ptr = l1;
        while(ptr!=null){
            System.out.println(ptr.val);
            ptr = ptr.next;
        }

    }
}
