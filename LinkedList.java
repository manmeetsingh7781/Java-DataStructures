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
    private Node currunt;

    LinkedList(){
        this.head = new Node();
        this.currunt = this.head;
        this.tail = null;
    }

    void setData(int value) {
        this.currunt.Next = new Node();
        this.currunt = this.currunt.Next;
        this.currunt.data = value;
        this.currunt.Next = null;
        if(isNull())
            this.tail = null;
    }

    private boolean isNull(){
        return this.currunt.Next == null;
    }

    void showNodes(){
        this.currunt = this.head.Next;
        while(this.currunt != this.tail){
            System.out.println(this.currunt.data);
            this.currunt = this.currunt.Next;
        }
    }


}

