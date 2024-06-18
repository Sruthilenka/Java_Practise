package LinkedListImplementation;

public class DeleteNodeLL {
    public static ListNode deleteNodeFromStart(ListNode head){
      head = head.next;
        return head;
    }

    public static ListNode deleteNodeFromLast(ListNode head){
        ListNode ptr = head;
        while(ptr.next.next != null){
            ptr=ptr.next; //making ptr as the second last node
        }
        ptr.next = null; //marking null as next of the second last node.
        return head;
    }
    public static ListNode deleteNodeFromMiddle(ListNode head,int position){
       ListNode ptr = head;
       for(int i=0;i<position-1;i++){
           ptr = ptr.next;
       }
       //get position of nodeto be deleted
        ListNode nodeToDelete = ptr.next;

       //get the next node
        ListNode nextNode = nodeToDelete.next;

        //point ptr to next node
        ptr.next = nextNode;

        return head;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(10);
        ListNode l3 = new ListNode(15);

        l1.next = l2;
        l2.next = l3;
        l3.next = null;

    //  ListNode head = deleteNodeFromStart(l1);
      //  ListNode head = deleteNodeFromLast(l1);
        ListNode head = deleteNodeFromMiddle(l1,1);

        ListNode ptr = head;
        while (ptr != null) {
            System.out.println(ptr.val);
            ptr = ptr.next;
        }

    }
}
