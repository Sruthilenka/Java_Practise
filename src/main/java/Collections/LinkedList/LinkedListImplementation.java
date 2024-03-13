package Collections.LinkedList;

import javax.xml.soap.Node;

public class LinkedListImplementation {
    Node head;
   class Node {
       int data;
       Node next;

       Node(int data) {
           this.data = data;
           next = null;
       }
   }

        public void printLL() {
            Node n= head;
            while(n!=null){
                System.out.println(n.data);
                n=n.next;
            }
        }

        public static void main(String[] args){
          LinkedListImplementation l1= new LinkedListImplementation();
          Node first= l1.new Node(10);
          l1.head=first;

          Node second=l1.new Node(20);
          first.next =second;

          Node third = l1.new Node(30);
          second.next = third;

          l1.printLL();
       }
   }
