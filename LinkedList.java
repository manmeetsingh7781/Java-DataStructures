// Manmeet Singh
/*
Head -> data|Pointer -> data|Pointer -> data|Pointer -> Null <- Tail

First element is Head
Last element is Tail


*/

class Node {
    // Data to store value
    int data;

    // This points to the next Node
    Node Next;
}

public class LinkedList {

    // Linked list is like a snail, a linear thing that has head and a tail, Imagine a snake is moving and the head is the first element and its body is node that can be changed over time, and the tail is the last pointer that has a null

    Node head, tail;
    private Node current;

    LinkedList(){
        this.head = new Node();
        this.current = this.head;
        this.tail = null;
    }

    void setData(int value) {
        if(this.head.data == 0 && this.tail == null){
            this.head.data = value;
            return;
        }
        this.current.Next = new Node();
        this.current = this.current.Next;
        this.current.data = value;
        this.current.Next = null;
        if(isNull()) {
            this.tail = null;
        }
    }

    private boolean isNull(){
        return this.current.Next == null;
    }

    void showNodes(){
        this.current = this.head.Next;
        while(this.current != this.tail){
            System.out.println(this.current.data);
            this.current = this.current.Next;
        }
    }
}
