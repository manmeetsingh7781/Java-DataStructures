// Manmeet Singh
/*

Implements First in, First out

*Remove Previous elements*

1 <- Front
2
3
4 <- Back

*Insert new elements*


Enqueue() — Inserts element to the end of the queue
Dequeue() — Removes an element from the start of the queue
isEmpty() — Returns true if queue is empty
Top() — Returns the first element of the queue


*/

class Queues {

    private int[] queues;
    private int front, back, limit;

    // Initialization
    Queues(int size){

        this.queues = new int[size];
        this.limit = size-1;
        this.front = 0;
        this.back = 0;

    }

    // Adds the value in the back of the queue
    void enqueue(int value){
        if(!isFull()){
            this.queues[this.back++] = value;
        }else throw new ArrayIndexOutOfBoundsException();
    }

    // removes the element and returns it
    int dequeue(){
        return this.queues[this.front++];
    }

    // checks if the queue is empty with values of 0
    boolean isEmpty(){
        int start, counter;

        counter = 0;
        start = 0;
        
        while(start <= limit){
            if(this.queues[start] == 0)
                counter++;
            start++;
        }
        return counter == start;
    }

    // Checks if the queue is full
    private boolean isFull(){
        return this.front == this.limit-1;
    }

    // returns the size of queue can hold
    int size(){
        return this.limit;
    }

    // return the top element of the queue without removing it
    int top(){
        return this.queues[this.front];
    }

}

