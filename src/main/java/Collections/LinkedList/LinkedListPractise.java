package Collections.LinkedList;

import javax.xml.soap.Node;

public class LinkedListPractise {
    Node head;
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data =data;
            next= null;
        }
    }
    public void printLLMet(){
        Node n = head;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }

    }

    public static void main(String[] args){
        LinkedListPractise p1= new LinkedListPractise();
        Node first = p1.new Node(10);
       p1.head = first;
       p1.printLLMet();
    }
}
