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
    private int front, back, limit, top;

    // Initialization
    Queues(int size){

        this.queues = new int[size];
        this.limit = size-1;
        this.front = 0;
        this.back = 0;
        this.top = 0;

    }

    // Adds the value in the back of the queue
    void enqueue(int value){
        if(!isFull()){
            this.queues[this.back++] = value;
        }else throw new ArrayIndexOutOfBoundsException();
    }

    // removes the element and returns it
    int dequeue(){
        int out = this.queues[this.front];
        this.queues[this.front] = 0;
        this.back--;
        this.front++;
        if(isEmpty()){
            this.front = 0;
        }
        return out;
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
    boolean isFull(){
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

    // Reverse the first k elements
    void reverse(int to_index){
        int start, temp;
        for(start = 0; start <= to_index; start++){
            if(this.queues[start] > this.queues[to_index-start]) {
                temp = this.queues[start];
                this.queues[start] = this.queues[to_index - start];
                this.queues[to_index - start] = temp;
            }
        }
    }

    // sorts the Queue
    void sort(){
        int start, temp;
        for(start = 0; start <= this.size()/2; start++){
            if(this.queues[start] > this.queues[this.size()-start]) {
                temp = this.queues[start];
                this.queues[start] = this.queues[this.size() - start];
                this.queues[this.size() - start] = temp;
            }
        }
    }
}
