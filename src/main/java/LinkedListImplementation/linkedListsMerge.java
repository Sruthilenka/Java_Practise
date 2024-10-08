package LinkedListImplementation;

public class linkedListsMerge {
    public static ListNode mergeList(ListNode l1,ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        //append remaining nodes if any
        if(l1 != null){
            current.next = l1;
        }else{
            current.next = l2;
        }

        return dummy.next;
    }




    public static void main(String[] args) {
        ListNode l1= new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2= new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode head = mergeList(l1,l2);

        ListNode ptr = head;
        while(ptr!=null){
            System.out.println(ptr.val);
            ptr= ptr.next;
        }

    }
}
