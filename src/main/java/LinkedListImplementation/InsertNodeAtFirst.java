package LinkedListImplementation;

public class InsertNodeAtFirst {
    public static ListNode insertAtStart(ListNode head, int valToInsert) {
        ListNode newNode = new ListNode(valToInsert); //new node with new value created
        newNode.next = head; //linking the first node to the end of new node
        head = newNode; //assigning head to new node

        return head;
    }


    public static ListNode insertAtEnd(int valToInsert, ListNode last, ListNode head) {
        ListNode newNode = new ListNode(valToInsert);
        last.next = newNode;
        newNode.next = null;

      /*  ListNode ptr = head;
        while (ptr != null) {
            System.out.println(ptr.val);
            ptr = ptr.next;
        }*/
        return head;

    }

    //When end of the list is not known
    public static ListNode insertAtEnd(int valToInsert, ListNode head) {
        ListNode newNode = new ListNode(valToInsert);

        ListNode ptr = head;
        while (ptr.next != null) { // here we have to check if ptr.next is not null
            ptr = ptr.next;
        }
        ptr.next = newNode;
        return head;

    }

    public static ListNode insertAtMiddle(int valToInsert, ListNode head, int position) {
        ListNode newNode = new ListNode(valToInsert);
        ListNode ptr = head;
        for (int i = 0; i < position; i++) {
            ptr = ptr.next;//reached until 3rd postion
        }
        newNode.next = ptr.next; //pointing newnodes pointer to 4th node
        ptr.next = newNode; //pointing 3rd node pointer to new node

        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(10);
        ListNode l3 = new ListNode(15);

        l1.next = l2;
        l2.next = l3;
        l3.next = null;

        //ListNode head = insertAtStart(l1,1);
        //  ListNode head = insertAtEnd(20,l3,l1);
        //ListNode head=  insertAtEnd(20, l1);
        ListNode head = insertAtMiddle(12, l1, 1);

        ListNode ptr = head;
        while (ptr != null) {
            System.out.println(ptr.val);
            ptr = ptr.next;
        }

    }
}
