// Manmeet Singh
// Methods should Array Have
/*
Insert — Inserts an element at given index
Get — Returns the element at given index
Delete — Deletes an element at given index
Size — Get the total number of elements in array
Sort - To sort the list in order
 */

public class Arrays {

    private int[] array;
    private int first_element, last_element;

    Arrays(int size){
        array = new int[size];
        first_element = -1;
        last_element = size;
    }

    // This function adds the value in the array
    void insert(int value){
        if (!isFull()) {
                first_element++;
                this.array[first_element] = value;
        }else throw new ArrayIndexOutOfBoundsException();

    }

    // This function Gets the elements from the Array by getting the user value based on the index value
    void get(int index){
        if (index <= last_element)
            System.out.println(this.array[index]);
        else throw new  ArrayIndexOutOfBoundsException();
    }

    // This function will delete the value at the given index from the array
    void delete(int index){
        if(index <= last_element){
            first_element--;
            this.array[index] = 0;
        }else throw new ArrayIndexOutOfBoundsException();

    }

    // return the numbers of elements that can be store in the array
    int length(){
        return this.last_element -1;
    }

    // Checks if the array is full
    private boolean isFull() {
        return first_element == last_element -1;
    }

    // This function sorts the array
    void sort(){
        int start, temp, length = this.length();
        for(start = 0; start <=  length/2; start++){
            if(this.array[start] > this.array[this.length()-start]){
                temp = this.array[start];
                this.array[start] = this.array[this.length()-start];
                this.array[this.length()-start] = temp;
            }
        }
    }
}
