public class MyStack {
    private final int[] elements;
    private int counter;

    public MyStack(int size){
        this.elements = new int[size];
        this.counter = 0;
    }

    public boolean isEmpty() {
        return counter == 0;
    }


    public int push(int value) {
     if(counter == elements.length){
         throw new StackOverflowError("Stack is full");
     }
     elements[counter++] = value;
     return value;
    }

    public int pop() {
        if(counter == 0){
            throw new IllegalArgumentException("Stack is empty");
        }
      return elements[counter--];

    }

    public int peek() {
        if(counter == 0){
            throw new IllegalArgumentException("Stack is empty");
        }
        return elements[counter -1];
    }


    public int size(int value) {
        if(counter == 0){
            throw new IllegalArgumentException("Stack is empty");
        }
        return counter;
    }

    public boolean search(int value) {
        for (int element : elements) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }
}
