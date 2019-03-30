// Manmeet Singh
/*

Push — Inserts an element at the top
Pop — Returns the top element after removing from the stack
isEmpty — Returns true if the stack is empty
Top — Returns the top element without removing from the stack

3 <- Top
2
1 <- Last

*/

public class Stack {

    private int[] stack;
    private int  last, top;

    Stack(int size){
        this.stack = new int[size];
        last = size;
        top = -1;
    }

    // This function pushes the value in the stack
    void push(int value){
        if(!isFull()){
            top++;
            this.stack[top] = value;
        }else throw new ArrayIndexOutOfBoundsException();
    }

    // This function takes the value out from the stack
    int pop(){
        int top_item = this.stack[top];
        this.stack[top] = 0;
        top--;
        return top_item;
    }

    // returns if the stack is full or no
    boolean isFull(){
        return top == last-1;
    }

    // return is the stack has all the values of 0 which means is empty or no
    boolean isEmpty(){
        int start, value_check;
        start = 0;
        value_check = 0;

        while(start <= this.length()){
            if(this.stack[start] == 0)
                value_check +=1;
            start++;
        }
        return value_check == start;
    }

    // return the size of stack
    int length(){
        return this.last-1;
    }

    // return the top element of stack without removing it 
    int top(){
        return this.stack[top--];
    }
}
