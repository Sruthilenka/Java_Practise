package LinkedListImplementation;

public class TraversingLinkedList {
    public static void traverseLL(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(10);
        ListNode l3 = new ListNode(15);

        l1.next = l2;
        l2.next = l3;
        l3.next = null;

        traverseLL(l1);
    }
}
