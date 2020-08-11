package Day22;

import Day23.ReverseLinkedList;

public class LinkedListOperation {

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public Node insert(Node head, int data){

        Node newNode = new Node(data);

        if( head==null){
            head = newNode;
            return head;
        }else{
            head.next = insert(head.next,data);
        }

        return head;
    }

    public void print(Node head){

        if( head==null){
            return;
        }
        System.out.println(head.data);
        print(head.next);
    }

    public  int findLength(Node head){

        if( head==null){
            return 0;
        }

        return 1 + findLength(head.next);
    }

    public static void main(String[] args) {
        LinkedListOperation ll = new LinkedListOperation();
        Node head = null;
        head = ll.insert(head,10);
        head = ll.insert(head, 20);
        head = ll.insert(head,30);
        head = ll.insert(head,40);
        ll.print(head);
        int count = ll.findLength(head);
        System.out.println(count);
    }
}
